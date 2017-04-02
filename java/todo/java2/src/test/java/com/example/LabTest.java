package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.example.Lab.*;

public class LabTest {
	
	@Test
	public void testFibonacci() {
		assertEquals("fibonacci(0)  = 0",     0, fibonacci(0));
		assertEquals("fibonacci(1)  = 1",     1, fibonacci(1));
		assertEquals("fibonacci(2)  = 1",     1, fibonacci(2));
		assertEquals("fibonacci(3)  = 2",     2, fibonacci(3));
		assertEquals("fibonacci(10) = 55",   55, fibonacci(10));
		assertEquals("fibonacci(13) = 233", 233, fibonacci(13));
	}
	
	@Test
	public void testSort() {
		assertArrayEquals("sort([]) = []",             new int[]{},       sort(new int[]{}));
		assertArrayEquals("sort([1]) = [1]",           new int[]{1},      sort(new int[]{1}));
		assertArrayEquals("sort([2,1]) = [1,2]",       new int[]{1,2},    sort(new int[]{2,1}));
		assertArrayEquals("sort([1,1]) = [1,1]",       new int[]{1,1},    sort(new int[]{1,1}));
		assertArrayEquals("sort([-1,1,0]) = [-1,0,1]", new int[]{-1,0,1}, sort(new int[]{-1,1,0}));
	}
	
	@Test
	public void testFactorial() {
		assertEquals("factorial(0) = 1",              1, factorial(0));
		assertEquals("factorial(1) = 1",              1, factorial(1));
		assertEquals("factorial(2) = 1",              2, factorial(2));
		assertEquals("factorial(3) = 1",              6, factorial(3));
		assertEquals("factorial(10) = 3628800", 3628800, factorial(10));	
	}
	
	@Test
	public void testRotateLeft() {
		assertArrayEquals("rotateLeft([1,2,3,4,5], 1) = [2,3,4,5,1]", new int[]{2,3,4,5,1}, rotateLeft(new int[]{1,2,3,4,5}, 1));
		assertArrayEquals("rotateLeft([1,2,3,4,5], 6) = [2,3,4,5,1]", new int[]{2,3,4,5,1}, rotateLeft(new int[]{1,2,3,4,5}, 6));
		assertArrayEquals("rotateLeft([1,2,3,4,5], 3) = [4,5,1,2,3]", new int[]{4,5,1,2,3}, rotateLeft(new int[]{1,2,3,4,5}, 3));
		assertArrayEquals("rotateLeft([1,2,3,4,5], 0) = [1,2,3,4,5]", new int[]{1,2,3,4,5}, rotateLeft(new int[]{1,2,3,4,5}, 0));
	}
	
	@Test
	public void testBalancedBrackets() {
		assertTrue("balancedBrackets(\"()\") = true", balancedBrackets("()"));
		assertTrue("balancedBrackets(\"()()\") = true", balancedBrackets("()()"));
		assertTrue("balancedBrackets(\"(())\") = true", balancedBrackets("(())"));
		assertTrue("balancedBrackets(\"({[]})\") = true", balancedBrackets("({[]})"));
		
		assertFalse("balancedBrackets(\"(\") = false", balancedBrackets("("));
		assertFalse("balancedBrackets(\")\") = false", balancedBrackets(")"));
		assertFalse("balancedBrackets(\"(()\") = false", balancedBrackets("(()"));
		assertFalse("balancedBrackets(\"([)]\") = false", balancedBrackets("([)]"));
		
	}
	
}
