package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanBImpl implements BeanB {
	
	@Override
	public void methodInBeanB() {
		System.out.println("BeanBImpl");
	}

}
