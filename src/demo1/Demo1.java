package demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
	
	/**
	 * 原来的方式
	 */
	@Test
	public void run1(){
		UsersServices us = new UsersServiceImpl();
		us.sayHello();
		
	}
	
	/**
	 * 注解的方式
	 */
	@Test
	public void run2(){
		// 获取工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取对象
		UsersServices us = (UsersServices) ac.getBean("usersService");
		us.sayHello();
		
	}

}
