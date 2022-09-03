/*----------------------------------------------------------------------------------------------------------------------
	Tür (type): Bir değişken içine bellekte ne kadar yer ayrılacağını ve içerisinde verinin hangi yöntemle tutulacağını
	belirten kavramdır.
	
	Java'da türler genel olarak iki gruba ayrılır:
	Temel türler (primitive/built-in/predefined types), programcının tanımladığı türler (user defined types)
	
	Her temel tür ismi bir anahtar sözcük ile temsil edilir:
	
	Temel türler aşağıdaki tabloda belirtilmiştir:
	
	Tür ismi				Uzunluğu (byte)
	short						2
	int							4
	long						8
	byte						1
	
	float						4
	double						8
	
	char						2
	boolean						-
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		System.out.println("App.main");
		System.out.println("Hello, World");
		Sample.foo();
		Sample.bar();
		csd.Mample.tar();
		System.out.println("Goodbye, World");
	}
}

class Sample {	
	public static void foo()
	{
		System.out.println("Sample.foo");
		bar();
	}
	
	public static void bar()
	{
		System.out.println("Sample.bar");
		Mample.tar();
	}
}


class Mample {
	public static void tar()
	{
		System.out.println("Mample.tar");	
		Sample.foo();
	}
	
	public static void car()
	{
		System.out.println("Mample.car");	
		tar();
	}
}