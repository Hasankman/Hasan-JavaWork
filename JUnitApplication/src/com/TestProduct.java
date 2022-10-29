package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Unit.Calculator;



public class TestProduct {
	@Test  // check if FindBig() method returns right results
	public void runFindBig() {
		//assertequals check if first argument is equal to 2nd args
		assertEquals(500,Calculator.findBig(500, 200));
	}
	
	@Test  // check if FindBig() method returns right results
	public void runFindSmall() {
		//assertequals check if first argument is equal to 2nd args
		assertEquals(5,Calculator.findSmall(10, 20));
	}
	
	

}