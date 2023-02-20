package com.volthread;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle1Application {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
	      Collections jc=(Collections)context.getBean("javaCollection");

	      jc.getAddressList();
	      jc.getAddressSet();
	      jc.getAddressMap();
	      jc.getAddressProp();
	}

}
