/*----------------------------------------------------------------------------------------------------------------------
	Bir dizi yaratıldığında tüm elemanlarına default değerler atanır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args) 
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		int [] a = new int[count];
		boolean [] b = new boolean[count];

		for (int i = 0; i < count; ++i)
			System.out.printf("%d ", a[i]);

		System.out.println();

		for (int i = 0; i < count; ++i)
			System.out.printf("%b ", b[i]);

		System.out.println();
	}
}

