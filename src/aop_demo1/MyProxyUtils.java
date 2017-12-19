package aop_demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用JDK的方式生成代理对象
 * @author vodka
 *
 */

public class MyProxyUtils {
	
	public static UserDao getProxy(final UserDao dao){
		// 使用Proxy类生成代理对象
		// 第一个参数是类的加载器，第二个参数是实现了哪些接口,是一种接口,第三个是匿名内部类
		UserDao proxy = (UserDao)Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {
			
			// 代理对象方法一执行，invoke方法就会执行一次
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// 让dao类里的save或者update方法正常执行
				return method.invoke(dao, args);
			}
		});
		
		// 返回代理对象
		return proxy;
	}

}
