package com.example.design_pattern.factory_method;

public class IDCard extends Product {
	
	private String owner;
	
	IDCard(String owner) {
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner + "のカードを使います。");
	}
	
	public String getOwner() {
		return owner;
	}

}
