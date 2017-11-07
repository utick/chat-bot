package win.onebit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XqApplicationTests {

	@Test
	public void contextLoads() throws IOException {
		String talk = TuLingUtils.talk("王尼玛是谁?");
		System.out.println(talk);
	}

}
