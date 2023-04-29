/*----------------------------------------------------------------------------------------------------------------------
	Sarmalayan Sınıflar (Wrapper Classes): Java'da her temel türe karşılık gelen bir sınıf vardır. Bu sınıflara sarmalayan
	sınıflar denir. Böyle bir tasarımın gerekliliği sınıfları tanıdıkça anlaşılacaktır. Bu sınıfların sarmalamanın dışında
	ilgili temel türe yönelik bazı yararlı elemanları da vardır. Örneğin Integer sınıfının parseInt metodu ile bir yazıdan
	int türden bir değer elde edilebilir. Temel türlere ilişkin sarmalayan sınıflar şunlardır:

	Temel Tür									Sarmalayan Sınıf
	short											 Short
	int											 	 Integer
	long											 Long
	byte											 Byte
	double											 Double
	float											 Float
	char											 Character
	boolean											 Boolean

	Bu sınıfların temel özellikleri şunlardır:
	- Bu sınıflardan tamsayı ve gerçek sayı türlerine ilişkin olanları java.lang paketi içerisinde bulunan Number sınıfından
	türetilmiştir. Bu sebeple bu sınıflara "numeric wrapper calsses" da denilmektedir.

	- Bu sınıfların hepsi java.lang paektinde bildirilmiştir

	- Bu sınıfların hepsi immutable'dır

	- Bu sınıfların sarmalamadaki amacı temel türlere ilişkin değerlerin heap'de tutulmasını sağlamaktır. Bu kavrama
	"kutulama (boxing)" denir. Bu konu ileride ele alınacaktır

	- Java 9 ile birlikte sarmalayan sınıfların ctor'ları deprecated olmuştur. Zate Java 5'den itibaren ctor'ların
	kullanılması iyi bir teknik değildir. Artık deprecated olduğundan zaten kullanılması hiç düşünülmemelidir. Bunun
	nedeni ileride ele alınacaktır

	- Sarmalayan sınıflara "platform classes" da denilmektedir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		RandomAFactory factory = new RandomAFactory();
		Scanner kb = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();

		for (int i = 0; i < n; ++i) {
			A x = factory.getRandomA();

			System.out.printf("Dinamik tür:%s%n", x.getClass().getName());

			B y;

			if (x instanceof B)
				y = (B)x;

			System.out.println("----------------------------------------------------");
		}
	}
}

class RandomAFactory {
	private final Random m_random = new Random();

	public A getRandomA()
	{
		return switch (m_random.nextInt(5)) {
			case 0 -> new A();
			case 1 -> new B();
			case 2 -> new C();
			case 3 -> new D();
			default -> new E();
		};
	}
}

class E extends C {
	//...
}

class D extends A {
	//...
}

class C extends B {
	//...
}

class B extends A {
	//...
}

class A {
	//...
}
