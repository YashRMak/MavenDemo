package com.lti.demo;

public class Calculator {
	public String sayHello() {
		return "hello";
	}
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public void searchEmpId(int empid){
        if(empid==0)
        {
            throw new ArithmeticException("u enetered zero");
        }
        else
        {
            System.out.println(" do something");
        }
	}
}
