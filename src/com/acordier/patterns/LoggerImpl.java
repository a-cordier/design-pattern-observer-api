package com.acordier.patterns;

public class LoggerImpl implements Logger {
	
	@Override
	public void log(Object event) {
		System.out.println(event);	
	}

}
