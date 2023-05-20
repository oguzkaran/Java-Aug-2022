/*----------------------------------------------------------------------------------------------------------------------
	Dinamik büyüyen dizi (dynamic array) veri yapıları diziye eklenen eleman sayısı kadar büyütmez. Dizinin büyütülmesi
	gerektiği durumda büyütme işlemlerini biraz fazlaca yapar. İşte bu tarz veri yapılarında dizinin gerçek uzunluğuna
	"capacity" denir. Dizide mantıksal olarak tutulan elemanların sayısına size/count" denir. size hiçbir zaman capacity
	değerinden büyük olamaz. Bu durumda capacity değeri size değerine eşit veya size değerinden büyük olabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

class App {
	public static void main(String [] args)
	{
		Random random = new Random();
		int [] a = ArrayUtil.getRandomArray(random, 10, 10, 21);

		int [] temp = a;

		ArrayUtil.print(a);

		a = ArrayUtil.copyOf(a, a.length * 2);

		ArrayUtil.print(a);

		System.out.println(a == temp ? "Aynı dizi" : "Farklı diziler");
	}
}




