package com.example.design_pattern.iterator;

/**
 * 数え上げ、スキャンを行うインターフェース
 */
public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}
