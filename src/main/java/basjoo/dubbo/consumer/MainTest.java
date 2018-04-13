package basjoo.dubbo.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basjoo.dubbo.inter.ShowMessage;

public class MainTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:spring.xml"}); 
		ShowMessage message = (ShowMessage) context.getBean("showMessage");
		String name = "wulinli";
		message.showMessage();
		message.setName(name);
		while(true);
	}
}
