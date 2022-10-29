package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Unit.Calculator;



public class TestCustomer {
	@Test  // check if FindBig() method returns right results
	public void runFindBiggest() {
		//assertequals check if first argument is equal to 2nd args
		assertEquals(26,Calculator.findBiggest(10,20,15));
	}
	
	

}