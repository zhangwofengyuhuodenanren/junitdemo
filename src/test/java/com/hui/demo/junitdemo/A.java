package com.hui.demo.junitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A {
	@Test
	public void testA() {
		System.out.println("A running");
		assertEquals("a","a");
	}
}
