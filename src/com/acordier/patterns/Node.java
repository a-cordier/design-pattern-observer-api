package com.acordier.patterns;

import java.util.Date;
import java.util.Observable;
/**
 * @author acordier
 */
public class Node extends Observable {
	
	private String name;
	private Event event;
	
	public Node(String name){
		this.name = name;
		this.event = new EventImpl();
	}
	
	public void createChildNode(){
		/* business logic to create a child node */
		synchronized(event){
			EventImpl _event = (EventImpl)event;
			_event.setTimestamp(new Date().getTime());
			_event.setEventData("child removed from node " + this.name);
			_event.setOriginator(this);
		 	setChanged(); 
		 	notifyObservers(event);
		}
	}
	
	public void removeChildNode(){
		/* business logic to remove a child node */
		synchronized(event){
			EventImpl _event = (EventImpl)event;
			_event.setTimestamp(new Date().getTime());
			_event.setEventData("child removed from node " + this.name);
			_event.setOriginator(this);
			notifyObservers(event);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Node [name=" + name + "]";
	}
	
	
	
	
}
