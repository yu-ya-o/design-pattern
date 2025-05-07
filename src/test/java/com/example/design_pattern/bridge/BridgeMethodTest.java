package com.example.design_pattern.bridge;

import org.junit.jupiter.api.Test;

public class BridgeMethodTest {
	
	@Test
	void bridgeMethod_test() {
		Display d1 = new Display(new StringDisplayImpl("Hello, Japan"));
		d1.display();
		
		Display d2 = new Display(new StringDisplayImpl("Hello, World"));
		d2.display();
		
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));
		d3.display();
		d3.multiDisplay(5);
	}

}
