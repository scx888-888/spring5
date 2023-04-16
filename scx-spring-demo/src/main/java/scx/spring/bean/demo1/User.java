package scx.spring.bean.demo1;

import org.springframework.stereotype.Component;

/**
 * @Author scx
 * @Date 2023/3/31 15:52
 * @Description
 */
@Component
public class User {
	private String name;
	private int id;
	private int score;

	public void sayIisUser(){
		System.out.println("我是user");
	}
}
