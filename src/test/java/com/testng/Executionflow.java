package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Executionflow {
	@BeforeMethod
	public void test2() {
		System.out.println("beforeMethod");

	}
	
	@BeforeSuite
	public void test7() {
		System.out.println("beforesuite");

	}
	
	@BeforeGroups
	public void test8() {
		System.out.println("beforegroup");

	}
	
	

	@BeforeClass
	public void test1() {
		System.out.println("beforeclass");

	}

	@Test
	public void test3() {
		System.out.println("test");

	}

	@BeforeTest
	public void test4() {
		System.out.println("beforeTest");

	}
	
	
	@AfterMethod
	public void test5() {
		System.out.println("Aftermethod");

	}
	
	@AfterGroups
	public void test9() {
		System.out.println("aftergroup");

	}
	
	@AfterTest
	public void test10() {
		System.out.println("Aftertest");
	}
	
	@Test
	public void test6() {
		System.out.println("test2");

	}
	@AfterClass
	public void test32() {
		System.out.println("afterclass");

	}
	@AfterSuite
	public void test61() {
		System.out.println("afterSuite");

	}
	

}
