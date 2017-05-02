package com.example.beans;

public class BeanAImpl implements BeanA {
	
	private BeanB dog;
	
	public BeanAImpl(){}
	
	public BeanAImpl(BeanB dog) {
		super();
		this.dog = dog;
	}

	@Override
	public void methodInBeanA() {
		System.out.println("BeanAImpl");
		dog.methodInBeanB();
	}
	

	
	
}
