package win.onebit;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import win.onebit.model.req.TuLingReq;
import win.onebit.model.resp.TuLingResp;

import java.io.IOException;

public class TuLingUtils {
    public static final OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public static final String API_URL = "http://www.tuling123.com/openapi/api";
    public static final String API_KEY = "364b290940664e55b660d67ec1cd13fb";
    public static final ObjectMapper mapper = new ObjectMapper();

    public static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String talk(String question) throws IOException {
        TuLingReq tuLingReq = TuLingReq.builder().info(question).key(API_KEY).build();
        String result = post(API_URL, mapper.writeValueAsString(tuLingReq));
        System.out.println("TuLing result:" + result);
        mapper.disable(JsonParser.Feature.IGNORE_UNDEFINED);
        TuLingResp tuLingResp = mapper.readValue(result, TuLingResp.class);
        return tuLingResp.getText();
    }
}