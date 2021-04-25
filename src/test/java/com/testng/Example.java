package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example {

	/*	@Test
	private void test8() {
		System.out.println(Thread.currentThread().getId());

		SoftAssert s = new SoftAssert();
		s.assertTrue(true);
		System.out.println("done test8");


	}


	@Test
	private void test9() {
		System.out.println(Thread.currentThread().getId());

		SoftAssert s = new SoftAssert();
		s.assertTrue(true);
		System.out.println("pass test9");

		s.assertTrue(false);
		System.out.println("fail test9");
		s.assertAll();

	}*/

	@Test
	private void test10() {
		Assert.assertTrue(true);
		System.out.println("test10");
		Assert.assertTrue(true);
		System.out.println("test10 done");	

	}
	@Test
	private void test11() {
		Assert.assertTrue(true);
		System.out.println("test11");
		Assert.assertTrue(false);
		System.out.println("test11 done");	

	}
	@Test
	private void test12() {
		Assert.assertTrue(false);
		System.out.println("test12");
		Assert.assertTrue(true);
		System.out.println("test12 done");	

	}
}
