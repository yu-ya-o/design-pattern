package com.example.design_pattern.template_method;

/**
 * Concrete Class 1
 */
public class CharDisplay extends AbstractDisplay {
	
	private char ch;
	
	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}

}
