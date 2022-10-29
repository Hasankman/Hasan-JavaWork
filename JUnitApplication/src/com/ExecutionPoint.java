package com;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecutionPoint {

	public static void main(String[] args) {
		System.out.println("Do something in application");
		Result res=JUnitCore.runClasses(MasterTest.class);
		//res will collect all the results in an Array [pass, pass ,fail,pass]
		for(Failure fail:res.getFailures())
		{
			System.out.println(fail.toString());
		}
		System.out.println(res.wasSuccessful());
			
		System.out.println("Do something in application");

	}

}