package demo1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo2 {
	
	@Resource(name="usersService")
	private UsersServices UserService;
	
	@Test
	public void run1(){
		// 原来：获取工厂，加载配置文件，getBean()
		UserService.sayHello();
		
	}

}
