package aop_demo1;

import org.junit.Test;

public class aop_demo1 {
	
	@Test
	public void run1(){
		UserDao dao = new UserDaoImpl();
		dao.save();
		dao.update();
		
		System.out.println("===========================");
		
		// 使用工具类，获取到代理对象
		UserDao proxy = MyProxyUtils.getProxy(dao);
		proxy.save();
		proxy.update();
	}

}
