/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı long türden bir sayının basamaklarından oluşan diziyi döndüren getDigits
	isimli metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

class App {
	public static void main(String [] args)
	{
		ReverseTest.run();
	}
}

class ReverseTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int count = Integer.parseInt(kb.nextLine());

			if (count <= 0)
				break;

			int [] a  = getRandomArray(r, count, 0, 99);

			print(2, a);
			Util.reverse(a);
			print(2, a);
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class Util {
	public static void reverse(int [] a)
	{
		int left = 0;
		int right = a.length - 1;

		while (left < right)
			swap(a, left++, right--);
	}

	public static int sum(int [] a)
	{
		int total = 0;

		for (int i = 0; i < a.length; ++i)
			total += a[i];

		return total;
	}
}
