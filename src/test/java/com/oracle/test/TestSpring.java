package com.oracle.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.hellospring.HelloSpring;

public class TestSpring {
	@Test 
	public void testHello() { 
		//1.读取配置文件 
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//2.通过ac得到配置文件中配置的bean 
		HelloSpring hs=(HelloSpring) ac.getBean("helloSpring"); 
		//3.调用输出方法 
		hs.print();
	}
}
