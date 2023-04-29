/*----------------------------------------------------------------------------------------------------------------------
	Bir dizi referansının denamik türü JNI (Java Native Interface) tür ismi olarak elde edilir. Bu isim arakoddaki
	ismidir. Detaylar burada ele alınmayacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		int [] a = new int[5];
		boolean [] b = new boolean[10];
		double [] c = new double[20];
		long [] d = new long[23];
		char [] e = new char[34];
		Sample [] f = new Sample[20];
		String [] g = new String[30];
		int [][] h = new int[30][];

		System.out.printf("Dynamic Type:%s%n", a.getClass().getName());
		System.out.printf("Dynamic Type:%s%n", b.getClass().getName());
		System.out.printf("Dynamic Type:%s%n", c.getClass().getName());
		System.out.printf("Dynamic Type:%s%n", d.getClass().getName());
		System.out.printf("Dynamic Type:%s%n", e.getClass().getName());
		System.out.printf("Dynamic Type:%s%n", f.getClass().getName());
		System.out.printf("Dynamic Type:%s%n", g.getClass().getName());
		System.out.printf("Dynamic Type:%s%n", h.getClass().getName());
	}
}

class Sample {
	//...
}