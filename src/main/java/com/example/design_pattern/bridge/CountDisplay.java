package com.example.design_pattern.bridge;

/**
 * 機能の追加（機能の階層）
 */
public class CountDisplay extends Display {

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	public void multiDisplay(int times) {
		open();
		
		for (int i = 0; i < times; i++) {
			print();
		}
		
		close();
	}

}
