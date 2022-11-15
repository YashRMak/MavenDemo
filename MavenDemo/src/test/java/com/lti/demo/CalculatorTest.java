package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c= new Calculator();
	
	@Test
	public void testsayHello() {
		Assertions.assertEquals("hello",c.sayHello());
	}
	
	@Test
	public void testAdd() {
		Assertions.assertEquals(100,c.add(60,40),"Check the code again");
	}
	
	@Test
	void testAssertFalse(){
		Assertions.assertTrue("Max".length()==3);
		Assertions.assertFalse("Max".length()==10);
	}
	
	@Disabled
	@Test
	void testAssertNull() {
		String s1=null;
		String s2="abcd";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	public void testArrayList() {
		ArrayList<Integer> al= new ArrayList<Integer>();
		Assertions.assertEquals(0, al.size());
		al.add(100);
		al.add(200);
		Assertions.assertEquals(2,al.size());
	}
}