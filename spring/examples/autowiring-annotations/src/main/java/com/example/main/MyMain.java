package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beans.BeanA;
import com.example.beans.BeanAImpl;

public class MyMain {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		BeanA beanA = (BeanA) applicationContext.getBean("beanAImpl");
		beanA.methodInBeanA();
		
		
		//What is the output of this code?
		
		/*
		BeanA test = new BeanAImpl();
		test.methodInBeanA();
		*/
	}
}
