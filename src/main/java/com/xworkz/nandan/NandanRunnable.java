package com.xworkz.nandan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NandanRunnable {
	public static void main(String[] args) {
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configure.xml");
	 System.out.println(context);
	 Display b= context.getBean(Display.class);
	 System.out.println(b);
		
	}

}
