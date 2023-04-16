package scx.spring.bean.demo1;

import com.sun.media.jfxmedia.events.NewFrameEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author scx
 * @Date 2023/3/31 15:04
 * @Description
 */
public class Test {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
		Hello hello = (Hello)context.getBean("hello");
		hello.sayHelloSpring();
		hello.sayHelloSpring();
		ApplicationContext context1 = new AnnotationConfigApplicationContext(User.class);
		User user = (User) context1.getBean("user");
		user.sayIisUser();

		ApplicationContext context2 = new AnnotationConfigApplicationContext(ConfigBean.class);
		Hello hello1 = (Hello) context2.getBean("hello");
		User user1  = context2.getBean("user",User.class);
		hello1.sayHelloSpring();
		user1.sayIisUser();

	}
}
