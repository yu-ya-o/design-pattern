package com.example.design_pattern.bridge;

/**
 * 抽象クラスの実装クラス（実装の階層）
 */
public class StringDisplayImpl extends DisplayImpl {
	
	private String string;
	
	private int width;
	
	public StringDisplayImpl(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void rawClose() {
		printLine();
	}
	
	private void printLine() {
		System.out.print("+");
		
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}

}
