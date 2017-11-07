package win.onebit;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import win.onebit.model.Message;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/send")
    public String send(@RequestBody(required = false) Message message) {
        System.out.println("sssssssssssss");
        Gson gson = new Gson();
        String s = gson.toJson(message);
        System.out.println(s);
        return "hello";
    }
}
