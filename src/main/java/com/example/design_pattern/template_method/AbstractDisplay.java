package com.example.design_pattern.template_method;

/**
 * Abstract Class
 */
public abstract class AbstractDisplay {
	
	public abstract void open();
	
	public abstract void print();
	
	public abstract void close();
	
	public final void display() {
		open();
		
		for (int i= 0; i < 5; i++) {
			print();
		}
		
		close();
	}
}
