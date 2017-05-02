package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanAImpl implements BeanA {
	
	@Autowired
	private BeanB dog;

	@Override
	public void methodInBeanA() {
		System.out.println("BeanAImpl");
		dog.methodInBeanB();
	}
	

	
	
}
