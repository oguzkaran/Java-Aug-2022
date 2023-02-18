/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.getRandomArray;
import static org.csystem.util.array.ArrayUtil.print;

class App {
	public static void main(String [] args)
	{
		Random random = new Random();
		Scanner kb = new Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		double [] a = getRandomArray(random, kb.nextInt(), 2.345, 9.789);

		print(a);
	}
}