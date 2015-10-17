package com.acordier.patterns;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

	Logger logger;
	
	public ConcreteObserver(Node node){
		this.logger = new LoggerImpl();
		node.addObserver(this); // observer subscription
	}
	

	@Override
	public void update(Observable o, Object arg) {
		logger.log(arg);	
	}

}
