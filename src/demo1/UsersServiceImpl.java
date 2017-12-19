package demo1;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 组件注解，标记类
 * <bean id="usersService" value="demo1.UsersServiceImpl"/> == @Component(value="usersService")
 * @author vodka
 *
 */

@Component(value="usersService")
public class UsersServiceImpl implements UsersServices {
	
	// 给name属性注入美美的字符串,setName方法还可以省略不写
	@Value(value = "美美")
	private String name;
	
	// @Autowired，按类型自动装配
	// @Autowired
	// @Qualifier(value="usersDAO")      // 按名称注入，需同@Autowired一起使用
	
	// 是Java的注解，Spring框架支持该注解
	@Resource(name="usersDAO")
	private UsersDAO userDAO;

	/*public void setName(String name) {
		this.name = name;
	}*/


	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello Spring " + name);
		userDAO.save();

	}
	
	@PostConstruct
	public void init(){
		System.out.println("初始化。。。");
	}

}
