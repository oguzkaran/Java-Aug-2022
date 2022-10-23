/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının faktoriyel değerini döndüren factorial isimli metodu
	NumberUtil sınıfı içerisinde yazını ve aşağıdaki kod ile test ediniz.
	Açıklamalar:
		- Faktoriyel işleni aşağıdaki gibidir: 
			0! = 1
			1! = 1
			2! = 1 * 2
			3! = 1 * 2 * 3
			
			...
			
			n! = 1 * 2 * ... * (n - 1) * n
		- Negatif sayılar için faktoriyel değeri 1 olarak döndürülecektir	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		FactorialTest.run();
	}
}

class FactorialTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);		

		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		for (int n = 0; n <= val; ++n)
			System.out.printf("%d! = %d%n", n, NumberUtil.factorial(n));
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static long factorial(int n)
	{
		//TODO:		
	}	
}

