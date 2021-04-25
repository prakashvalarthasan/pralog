package com.testng.sel;

import org.testng.annotations.Test;

public class Login {

	@Test
	private void test1() {
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}

	@Test
	private void test2() {
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void test3() {
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void test4() {
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void test5() {
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void test6() {
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void test7() {
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void test8() {
		System.out.println(Thread.currentThread().getId());
	}

}
