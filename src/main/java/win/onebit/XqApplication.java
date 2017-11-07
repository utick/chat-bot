package win.onebit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class XqApplication {

	public static void main(String[] args) {
		SpringApplication.run(XqApplication.class, args);
	}
}
