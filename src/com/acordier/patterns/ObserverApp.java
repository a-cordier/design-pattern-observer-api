package com.acordier.patterns;

/*
 * Observer
 * A behavioral design-pattern 
 * Using JSE API
 */
public class ObserverApp {

	public static void main(String[] args) {
		Node subject = new Node("Folder");
		/* register observers */
		new ConcreteObserver(subject);
		new ConcreteObserver(subject);
		/* make events happen */
		subject.createChildNode();
		subject.createChildNode();
		subject.removeChildNode();
	}

}
