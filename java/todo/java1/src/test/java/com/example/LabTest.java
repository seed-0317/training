package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.example.Lab.*;

public class LabTest {

	@Test
	public void testCastToInt() {
		assertEquals("castToInt(0.0) = 0", 0, castToInt(0.0));
		assertEquals("castToInt(3.1) = 3", 3, castToInt(3.1));
		assertEquals("castToInt(5.9) = 5", 5, castToInt(5.9));
	}

	@Test
	public void testCastToByte() {
		assertEquals("castToByte(2) = 2", 2, castToByte((short)2));
		assertEquals("castToByte(128) = -128", -128, castToByte((short)128));

	}

	@Test
	public void testDivide() {
		assertEquals("divide(10,2) = 5.0", 5.0, divide(10, 2), 0.0001);
		assertEquals("divide(3,2) = 1.5", 1.5, divide(3, 2), 0.0001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivideByZero() {
		divide(1,0);
	}

	@Test
	public void testIsEven() {
		assertTrue("isEven(2) = true", isEven(2));
		assertFalse("isEven(3) = false", isEven(3));
	}

	@Test
	public void testIsAllEven() {
		assertTrue("f([2]) = true", isAllEven(new int[]{2}));
		assertTrue("f([2,4,6,8,10]) = true", isAllEven(new int[]{2,4,6,8,10}));

		assertFalse("f([3]) = false", isAllEven(new int[]{3}));
		assertFalse("f([2,4,6,8,11]) = false", isAllEven(new int[]{2,4,6,8,11}));
	}

	@Test
	public void testAverage() {
		assertEquals("average([2]) = 2", 2, average(new int[]{2}), 0.0001);
		assertEquals("average([2,3]) = 2", 2.5, average(new int[]{2,3}), 0.0001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAverageNull() {
		average(null);
	}

	@Test
	public void testIsPalindrome() {
		assertTrue("isPalindrome(\"a\") = true", isPalindrome("a"));
		assertTrue("isPalindrome(\"aba\") = true", isPalindrome("aba"));
		assertTrue("isPalindrome(\"abba\") = true", isPalindrome("abba"));

		assertFalse("isPalindrome(\"ab\") = false", isPalindrome("ab"));
	}

}
