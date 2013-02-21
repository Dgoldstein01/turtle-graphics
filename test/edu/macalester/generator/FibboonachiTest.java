package edu.macalester.generator;

import static org.junit.Assert.*;

import org.junit.Test;


public class FibboonachiTest {
	@Test
	public void generatorNegatives(){
		Fibboonachi generator = new Fibboonachi(-3);
		assertEquals(-6, generator.next());
		assertEquals(-9, generator.next());
		assertEquals(-15, generator.next());	
	}
	@Test
	public void generatorPositives(){
		Fibboonachi generator = new Fibboonachi(2);
		assertEquals(4, generator.next());
		assertEquals(6, generator.next());
		assertEquals(10, generator.next());
	}

}

