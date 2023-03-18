/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın non-static ve final veri elemanlarının sabit ifadesi ile ilkdeğerlenmesi gerekmez
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;

class App {
	public static void main(String [] args)
	{
		Sample s = new Sample();
		Sample k = new Sample();

		System.out.printf("s.x = %d%n", s.x);
		System.out.printf("k.x = %d%n", k.x);
	}
}

class Sample {
	private static int randomValue()
	{
		return new Random().nextInt(0, 100);
	}
	public final int x = randomValue();

	//...
}