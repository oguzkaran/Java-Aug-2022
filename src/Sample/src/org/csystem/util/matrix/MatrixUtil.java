/*----------------------------------------------------------------
	FILE		: MatrixUtil.java
	AUTHOR		: Java-Aug-2022 Group
	LAST UPDATE	: 04.03.2023

	Utility class for matrix operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.matrix;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class MatrixUtil {
    public static int [][] getRandomMatrix(Random random, int m, int n, int min, int bound)
    {
        int [][] result = new int[m][];

        for (int i = 0; i < m; ++i)
            result[i] = ArrayUtil.getRandomArray(random, n, min, bound);

        return result;
    }

    public static int [][] getRandomSquareMatrix(Random random, int n, int min, int bound)
    {
        return getRandomMatrix(random, n, n, min, bound);
    }

    public static boolean isMatrix(int [][] a)
    {
        //TODO:
    }

    public static boolean isSquareMatrix(int [][] a)
    {
        //TODO:
    }
}
