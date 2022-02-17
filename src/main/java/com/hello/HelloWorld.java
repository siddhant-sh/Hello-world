package com.hello;

public class HelloWorld {
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
		Calculator cal = new Calculator();
		System.out.println(cal.sum(2, 2));
		System.out.println(cal.divide(2, 2));
		System.out.println(cal.minus(2, 2));
		System.out.println(cal.multiply(2, 2));
	}
}
