package com.example;

public class Lab {

	/*
	 * 1. Cast from double to int
	 *
	 * labels:[primitives, casting]
	 *
	 * f(0.0) = 0
	 * f(3.1) = 3
	 */
	public static int castToInt(double n) {
		return 0;
	}

	/*
	 * 2. Cast from short to byte
	 *
	 * labels:[primitives, casting]
	 *
	 * f(2) = 2
	 * f(128) = -128
	 */
	public static byte castToByte(short n) {
		return 0;
	}

	/*
	 * 3. Division
	 *
	 * labels:[operators, exceptions, control statements]
	 *
	 * f(10,2) = 5.0
	 * f(3,2) = 1.5
	 * f(1,0) = throw IllegalArgumentException
	 */
	public static double divide(double operandOne, double operandTwo) {
		return 0;
	}

	/*
	 * 4. Even
	 *
	 * labels:[operators, control statements]
	 *
	 * f(2) = true
	 * f(3) = false
	 */
	public static boolean isEven(int n) {
		return false;
	}

	/*
	 * 5. All even
	 *
	 * labels:[operators, arrays, control statements]
	 *
	 * f([2]) = true
	 * f([2,4,6,8,10]) = true
	 *
	 * f([3]) = false
	 * f([2,4,6,8,11]) = false
	 */
	public static boolean isAllEven(int[] array) {
		return false;
	}

	/*
	 * 6. Average
	 *
	 * labels:[arrays, operators, control statements, exceptions]
	 *
	 * f([2]) = 2.0
	 * f([2,3]) = 2.5
	 * f(null) = throw IllegalArgumentException
	 */
	public static double average(int[] array) {
		return 0;
	}

	/*
	 * 7. Palindrome
	 *
	 * labels:[strings]
	 *
	 * f("a") = true
	 * f("aba") = true
	 * f("abba") = true
	 *
	 * f("ab") = false
	 */
	public static boolean isPalindrome(String str) {
		return false;
	}

}
