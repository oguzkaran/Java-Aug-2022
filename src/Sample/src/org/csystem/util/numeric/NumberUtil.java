/*----------------------------------------------------------------
	FILE		: NumberUtil.java
	AUTHOR		: Java-Aug-2022 Group
	LAST UPDATE	: 18.02.2023

	Utility class for numeric operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.numeric;

import static java.lang.Math.abs;
import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class NumberUtil {	
	public static int getDigitsPowSum(int val)
	{
		int n = countDigits(val);
		int total = 0;
			
		while (val != 0) {
			total += pow(val % 10, n);
			val /= 10;
		}		
			
		return total;		
	}
	
	public static int countDigits(int val)
	{			
		return (val != 0) ? ((int)log10(abs(val)) + 1) : 1;				
	}
	
	public static long factorial(int n)
	{
		long result = 1;
		
		for (int i = 2; i <= n; ++i)
			result *= i;		
		
		return result;
	}

	public static int [] getDigits(long val)
	{
		//TODO:
	}
	
	public static int getFibonacciNumber(int n)
	{
		if (n <= 2)
			return n - 1;
		
		int prev1 = 1, prev2 = 0, val = prev1 + prev2;
		
		for (int i = 3; i < n; ++i) {
			prev2 = prev1;
			prev1 = val;
			val = prev1 + prev2;
		}
		
		return val;		
	}
	
	public static int getNextFibonacciNumber(int val)
	{
		if (val < 0)
			return 0;
		
		int prev1 = 1, prev2 = 0, next;		
		
		for (;;) {
			next = prev1 + prev2;			
			
			if (next > val)
				return next;
			
			prev2 = prev1;
			prev1 = next;
		}
	}
	
	public static long getPrime(int n)
	{
		long val = 2;
		int count = 0;
		
		for (;;) {
			if (isPrime(val))
				++count;
			
			if (count == n)
				return val;
			
			++val;				
		}
	}
	
	public static boolean isArmstrong(int val)
	{
		return val >= 0 && getDigitsPowSum(val) == val;
	}
	
	public static boolean isEven(int val)
	{
		return val % 2 == 0;
	}
	
	public static boolean isOdd(int val)
	{
		return !isEven(val);
	}
	
	public static boolean isPrime(long val)
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;		

		if (val % 7 == 0)
			return val == 7;
		
		for (long i = 11; i * i <= val; i += 2)
			if (val % i == 0)
				return false;
		
		return true;
	}
	
	public static double max(double a, double b, double c)
	{
		return Math.max(Math.max(a, b), c);
	}
	
	public static int mid(int a, int b, int c)
	{
		if (a <= b && b <= c || c <= b && b <= a)
			return b;
		
		if (b <= a && a <= c || c <= a && a <= b)
			return a;
		
		return c;
	}
	
	public static double min(double a, double b, double c)
	{
		return Math.min(Math.min(a, b), c);
	}	
		
	public static int reverse(int val)
	{
		int result = 0;
		
		while (val != 0) {
			result = result * 10 + val % 10;
			val /= 10;
		}
		
		return result;
	}	
		
	public static int sumDigits(int val)
	{
		int sum = 0;
		
		while (val != 0) {
			sum += val % 10;
			val /= 10;
		}
		
		return abs(sum);
	}
}
