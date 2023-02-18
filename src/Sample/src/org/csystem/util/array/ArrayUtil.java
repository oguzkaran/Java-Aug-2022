/*----------------------------------------------------------------
	FILE		: ArrayUtil.java
	AUTHOR		: Java-Aug-2022 Group
	LAST UPDATE	: 18.02.2023

	Utility class for array operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {

    public static void fillRandomArray(Random random, int [] a, int min, int bound)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(min, bound);
    }

    public static void fillRandomArray(Random random, double [] a, double min, double bound)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextDouble(min, bound);
    }

    public static int [] getRandomArray(Random random, int count, int min, int bound)
    {
        int [] a = new int[count];

        fillRandomArray(random, a, min, bound);

        return a;
    }

    public static double [] getRandomArray(Random random, int count, double min, double bound)
    {
        double [] a = new double[count];

        fillRandomArray(random, a, min, bound);

        return a;
    }

    public static void print(int [] a)
    {
        print(1, a);
    }

    public static void print(int n, int [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for (int i = 0; i < a.length; ++i)
            System.out.printf(fmt, a[i]);

        System.out.println();
    }

    public static void print(double [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%f%n", a[i]);
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }

    public static void reverse(int [] a)
    {
        //TODO:
    }

    public static void swap(double [] a, int i, int k)
    {
        double temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }

    public static int sum(int [] a)
    {
        int total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i];

        return total;
    }
}
