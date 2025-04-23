package com.example.design_pattern.adapter;

import org.junit.jupiter.api.Test;

public class AdapterTest {
	
	@Test
	void adapter_test() {
		Print p = new PrintBanner("Hello!");
		
		p.printWeak();
		p.printStrong();
	}

}
