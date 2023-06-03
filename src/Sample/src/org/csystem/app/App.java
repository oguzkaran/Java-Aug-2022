/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.InputMismatchException;
import java.util.Scanner;

class App {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		try {
			System.out.print("Bir sayı giriniz:");
			double val = kb.nextDouble();
			double result = MathUtil.log10(val);

			System.out.printf("log10(%f) = %f%n", val, result);
		}
		catch (InputMismatchException ex) {
			System.out.println("Geçeriz değer girildi!...");
		}
		catch (Throwable ex) {
			System.out.println("Logaritma için geçersiz değer girilid!...");
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class MathUtil {
	public static double log10(double val)
	{
		if (val < 0)
			throw new IndeterminateException();

		if (val == 0)
			throw new UndefinedException();

		return Math.log10(val);
	}
}

class IndeterminateException extends RuntimeException {
	//...
}

class UndefinedException extends RuntimeException {
	//...
}
