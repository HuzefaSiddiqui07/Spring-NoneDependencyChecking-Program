package com.springframework.dependencychecking.none.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

		Client client = (Client) applicationContext.getBean("c");

		client.getClient(); // Call Method By Object

	}

}
