package win.onebit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import win.onebit.model.req.CommandReq;
import win.onebit.model.resp.CommandResp;
import win.onebit.model.resp.Directive;
import win.onebit.model.resp.DirectiveItem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {

    public static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    public static final String API_URL = "http://i.onebit.win:8030/channel/add?topic=u3&msg=%s";
    public static final OkHttpClient httpClient = new OkHttpClient();
    public static final ObjectMapper mapper = new ObjectMapper();

    @RequestMapping("/send")
    public Object send(@RequestBody(required = false) Object message) throws IOException {
        logger.info("=======================================");
        if (message == null) {
            return getResponseObject("123", "Hello world");
        }
        Gson gson = new Gson();
        String json = gson.toJson(message);
        logger.info("Recived linglong command:" + json);
        CommandReq commandReq = gson.fromJson(json, CommandReq.class);
        if (!StringUtils.equals(commandReq.getStatus(), "INTENT") &&
                !StringUtils.equals(commandReq.getStatus(), "LAUNCH")) {
            logger.info("Not intent return");
            return null;
        }
        Map<String, String> slots = commandReq.getSlots();
        String aSwitch = Optional.ofNullable(slots).orElse(new HashMap<>(0)).getOrDefault("switch", null);
        String device = Optional.ofNullable(slots).orElse(new HashMap<>(0)).getOrDefault("device_name", null);
        if (StringUtils.isBlank(aSwitch) || StringUtils.isBlank(device)) {
            return getResponseObject(commandReq.getSequence(), "无法识别,请重试");
        }
        logger.info(aSwitch + device);
        boolean b = doOprate(device, aSwitch);
        //回复内容
        String answerContent = b ? "操作成功" : "操作失败";
        String sequence = commandReq.getSequence();
        Object o = getResponseObject(sequence, answerContent);
        return o;
    }

    private boolean doOprate(String device, String aSwitch) throws IOException {
        String fullUrl = String.format(API_URL, "do " + aSwitch + device);
        Request request = new Request.Builder().url(fullUrl).get().build();
        Response execute = httpClient.newCall(request).execute();
        if (!execute.isSuccessful()) {
            return false;
        }
        String string = execute.body().string();
        return StringUtils.equalsIgnoreCase(Boolean.TRUE.toString(), string);
    }

    private Object getResponseObject(String sequence, String s) throws IOException {
        CommandResp resp = getCommandResp(sequence, s);
        Gson gson2 = new Gson();
        String answerJson = gson2.toJson(resp);
        return mapper.readValue(answerJson, Object.class);
    }

    private CommandResp getCommandResp(String sequence, String answer) {
        DirectiveItem directiveItem = new DirectiveItem(answer, "1");
        ArrayList<DirectiveItem> list = new ArrayList<>();
        list.add(directiveItem);
        return new CommandResp.Builder()
                .withVersionid("1.0")
                .withIsEnd(true)
                .withSequence(sequence)
                .withTimestamp(System.currentTimeMillis())
                .withDirective(new Directive.Builder().withDirectiveItems(list).build())
                .build();
    }
}
