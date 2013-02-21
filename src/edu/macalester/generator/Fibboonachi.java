package edu.macalester.generator;

public class Fibboonachi {
	private int cur,old;
	
	public Fibboonachi(int start) {
		this.cur = start;
		this.old = start;
	}
	
	public int next() {
		int x = cur+old;
		old = cur;
		cur = x;
		return x;
	}
}
