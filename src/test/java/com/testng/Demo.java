package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	@Parameters({"userName","password"})
	@Test()
	private void test5(@Optional("benny@123")String s1,@Optional("benny")String s2) {
		System.out.println(s1);
		System.out.println(s2);

	}

	@Test(invocationCount=1)
	private void testX() {
		System.out.println("testing X method");

	}
	
	@Test(dependsOnMethods= {"testZ"})
	private void testY() {
		System.out.println("testing Y method");

	}
	
	@Test(dependsOnMethods= {},groups="smoke")
	private void testZ() {
		System.out.println("testing Z method");

	}
}
