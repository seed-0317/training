package com.example;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton(){}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	
}
