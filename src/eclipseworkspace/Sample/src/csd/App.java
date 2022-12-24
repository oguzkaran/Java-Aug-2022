/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte resgele üretilen ilk 10 sayının dizilimi her çalıştırmada farklı olur. İlk 10 sayının diziliminin
	aynı gelme olasılığı düşüktür. İkinci üretilen 10 sayı klavyeden alınan tohum değerine göre üretilir. Bu durumda 
	örneğin her çalıştırmada tohum değeri 200 olarak girilirse ikinci üretilen 10 saynın dizilimi hep aynı olacaktır. 
	Programı çalıştırıp sonuçları gözlemleyiniz 
	
	seed = seed * 123456 *  23456;
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Random r = new java.util.Random();
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Bir sayı giriniz:");
		long seed = kb.nextLong();		
		
		for (int i = 0; i < 10; ++i)
			System.out.printf("%d ", r.nextInt(100));	
		
		System.out.println();
		
		r.setSeed(seed);
		
		for (int i = 0; i < 10; ++i)
			System.out.printf("%d ", r.nextInt(100));	
		
		System.out.println();
	}
}