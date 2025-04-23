package com.example.design_pattern.template_method;

import org.junit.jupiter.api.Test;

public class TemplateMethodTest {
	
	@Test
	void templateMthod_test() {
		AbstractDisplay d1 = new CharDisplay('A');
		d1.display();
		
		AbstractDisplay d2 = new StringDisplay("Hello, world!");
		d2.display();
		
		AbstractDisplay d3 = new StringDisplay("Buenosdias!");
		d3.display();
	}

}
