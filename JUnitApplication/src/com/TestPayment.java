package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Unit.Calculator;



public class TestPayment {
	@Test  // check if FindBig() method returns right results
	public void runFindBiggest() {
		//assertequals check if first argument is equal to 2nd args
		assertEquals(100,Calculator.findBiggest(10,20,15));
	}
	
	@Test  // check if FindBig() method returns right results
	public void runFindMax() {
		int[] myArray= {100,20,30,1500,400};
		assertEquals(340,Calculator.findMax(myArray));
	}

}