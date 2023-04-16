package scx.spring.bean.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author scx
 * @Date 2023/3/31 16:04
 * @Description
 */
@Configuration
public class ConfigBean {

	@Bean
	public User user(){
		User user = new User();
		return user;
	}

	@Bean
	public Hello hello(){
		Hello hello = new Hello();
		return hello;
	}
}
