package win.onebit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XqApplicationTests {

	@Autowired
	ApiController apiController;

	@Test
	public void contextLoads() throws IOException {
		String talk = apiController.talk("王尼玛是谁?");
		System.out.println(talk);
	}

}
