package com.example.main;

import org.apache.log4j.Logger;

public class MyMain {
	
	private static final Logger LOGGER = Logger.getLogger(MyMain.class);
	
	public static void main(String[] args) {
		
		LOGGER.fatal("dog");
		LOGGER.error("cat");
		LOGGER.warn("horse");
		LOGGER.info("mouse");
		LOGGER.debug("fox");
		LOGGER.trace("ship it squirrel");
	}
}
