package win.onebit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import win.onebit.model.req.CommandReq;
import win.onebit.model.resp.Card;
import win.onebit.model.resp.CommandResp;
import win.onebit.model.resp.Directive;
import win.onebit.model.resp.DirectiveItem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {

    public static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @RequestMapping("/send")
    public Object send(@RequestBody(required = false) Object message) throws IOException {
        logger.info("=======================================");
        Gson gson = new Gson();
        String json = gson.toJson(message);
        logger.info(json);
        CommandReq commandReq = gson.fromJson(json, CommandReq.class);
        String queryContent = Optional.ofNullable(commandReq).map(CommandReq::getSlots).map(
                stringStringMap -> stringStringMap.getOrDefault("chat_content", "没听懂")).orElse("没听懂");
        logger.info(queryContent);
        //回复内容
        String answerContent = "我知道啦";
        logger.info(answerContent);

        DirectiveItem directiveItem = new DirectiveItem(answerContent, "1");
        ArrayList<DirectiveItem> list = new ArrayList<>();
        list.add(directiveItem);
        //push to app
        Card card = new Card();
        card.setType("1");
        card.setTitle(queryContent);
        card.setText(answerContent);
        CommandResp resp = new CommandResp.Builder()
                .withVersionid("1.0")
                .withIsEnd(true)
                .withSequence(commandReq.getSequence())
                .withTimestamp(System.currentTimeMillis())
                .withDirective(new Directive.Builder().withDirectiveItems(list).build())
                .withCard(card)
                .build();
        ObjectMapper mapper = new ObjectMapper();
        String answerJson = gson.toJson(resp);
        logger.info(answerJson);
        return mapper.readValue(answerJson, Object.class);
    }

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        String s = "{\"versionid\":\"1.0\",\"status\":\"NOTICE\",\"sequence\":\"7e11772de96e46088082d0e8ede9943b\",\"timestamp\":1510035523526,\"application_info\":{\"application_id\":\"33weu086\",\"application_name\":\"xiao_nan\",\"application_version\":\"10000\"},\"session\":{\"is_new\":true,\"session_id\":\"d52faf3698b14bd1aae7d6783010a4b1\",\"attributes\":{}},\"user\":{\"user_id\":\"9255113cb6434e88b7997d105fa3e70d\",\"attributes\":{}},\"input_text\":\"跟小南说你好。\",\"notice_type\":\"DEV_SERVICE_RESP_PACK_ERROR\",\"extend\":{}}";
        String s2 = "{\"versionid\":\"1.0\",\"status\":\"INTENT\",\"sequence\":\"0c70c1bff06742d385a320eb28eafad6\",\"timestamp\":1510038617188,\"application_info\":{\"application_id\":\"33weu086\",\"application_name\":\"xiao_nan\",\"application_version\":\"10000\"},\"session\":{\"is_new\":true,\"session_id\":\"03f29a79903c438db6171119cc83fa76\",\"attributes\":{\"say_content\":\"对小南说告诉我历史上大灭绝的主要成因\",\"bizname\":\"小南\",\"chat_content\":\"告诉我历史上大灭绝的主要成因\"}},\"user\":{\"user_id\":\"9255113cb6434e88b7997d105fa3e70d\",\"attributes\":{}},\"input_text\":\"对小南说，告诉我历史上大灭绝的主要成因。\",\"slots\":{\"say_content\":\"对小南说告诉我历史上大灭绝的主要成因\",\"bizname\":\"小南\",\"chat_content\":\"告诉我历史上大灭绝的主要成因\"},\"extend\":{}}";
        CommandReq commandReq = gson.fromJson(s2, CommandReq.class);

        ObjectMapper mapper = new ObjectMapper();
        Object o = mapper.readValue(gson.toJson(commandReq), Object.class);
        System.out.println(commandReq.getInputText());
    }
}
