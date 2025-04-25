package com.example.design_pattern.factory_method;

import org.junit.jupiter.api.Test;

public class FactoryMethodTest {
	
	@Test
	void factoryMethod_test() {
		Factory factory = new IDCardFactory();
		
		Product card1 = factory.create("Steve Jobs");
		Product card2 = factory.create("Steve Wozniak");
		Product card3 = factory.create("Ronald Wayne");
		
		card1.use();
		card2.use();
		card3.use();
	}

}
