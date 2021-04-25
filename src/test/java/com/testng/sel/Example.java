package com.testng.sel;

import org.testng.annotations.Test;

public class Example {

	
	@Test(priority=5,enabled=false)
	private void test5() {
		System.out.println("test5");

	}
	
	
	@Test(priority = 7,groups="smoke")
	private void test4() {
		System.out.println("test4");

	}
	
	@Test(groups="sanity")
	private void test7() {
		System.out.println("test7");

	}
	
	@Test(groups="smoke")
	private void test3() {
		System.out.println("test3");

	}
	
	@Test (groups="regression")
	private void test2() {
		System.out.println("test2");

	}
	
	@Test (groups= {"regression","smoke"})
	private void test21() {
		System.out.println("test21");

	}
}
