package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAfterTest {

	Calculator c= new Calculator();
	int sum=0;
	
	@BeforeAll
	public static void testDbConn() {
		System.out.println("Db conn is up");
	}
	
	@BeforeEach
	public void testStart() {
		sum=500;
		System.out.println("before each");
	}
	
	@Test
	public void testsayHello() {
		Assertions.assertEquals("hello",c.sayHello());
	}
	
	@Test
	public void testAdd() {
		Assertions.assertEquals(100,c.add(60,40),"Check the code again");
	}
	
	@AfterAll
	public static void testDbClose() {
		System.out.println("once- db conn is closed");
	}
	
	@AfterEach
	public void testCleanUp() {
		sum=0;
		System.out.println("clean up");
	}

}
