/*----------------------------------------------------------------------------------------------------------------------
	Number sınıfının xxxValue metotları numerik sarmalayan sınıflar için (platform classes) ilişkin olduğu temel türe
	göre tür dönüştürme kurallarına uygun olarak çalışırlar. Yani örneğin int türden bir değerin short türüne explicit
	olarak dönüştürülmesi durumunda elde edilen değeri ile Integer sınıfının shortValue metodu ile elde edilen değer
	aynıdır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();

		Integer iVal = Integer.valueOf(val);
		short x = (short)val;
		short y = iVal.shortValue();

		System.out.printf("val = %08X%n", val);
		System.out.printf("x = %d, y = %d%n", x, y);
		System.out.printf("x = %04X, y = %04X%n", x, y);
	}
}

