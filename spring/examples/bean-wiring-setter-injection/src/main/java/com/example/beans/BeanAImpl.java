package com.example.beans;

public class BeanAImpl implements BeanA {
	
	private BeanB dog;

	public void setDog(BeanB dog) {
		this.dog = dog;
	}

	@Override
	public void methodInBeanA() {
		System.out.println("BeanAImpl");
		dog.methodInBeanB();
	}
	

	
	
}
