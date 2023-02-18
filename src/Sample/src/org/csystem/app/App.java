/*----------------------------------------------------------------------------------------------------------------------
	Dizilerin sıraya dizilmesi (sorting):
	Dizilerin sıraya dizilmesine yönelik pek çok algoritma bulunmaktadır.  Sıralama işleminin küçükten büyüğe yani artan
	sırada (ascending order) yapılmasına doğal sıralama (natural sort order) denir. Biz burada "kabarcık sıralama (bubble sort)" ve
	"seçerek sıralama (selection sort) algoritmalarını kodlayacağız. Algoritmalar doğal sıralama şeklinde anlatılacaktır.
	Ancak her iki sıralama da (ascending ve descending) kodlanacaktır

	Anahtar Notlar: Algoritmaların karşılaştırılmasına yönelik iki ölçüt vardır: hız (speed), kaynak kullanımı (resource usage).
	Burada baskın ölçüt hızdır. Burada kabarcık sıralama ve seçerek sıralama algoritmaları karşılaştırılmayacaktır.
	"Algoritma Analizi" isimli konuda bu ikiş algoritmanın karşılaştırılması yapılacaktır
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
