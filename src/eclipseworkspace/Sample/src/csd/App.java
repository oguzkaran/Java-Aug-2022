/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir n değeri için n-inci asal sayıyı döndüren getPrime isimli
	metodu yazınız ve aşağıdaki kod ile test ediniz
	
	Açıklamalar:
		- isPrime metodunun hızlı versiyonunu kullanınız
		- n değerinin pozitif olmaması durumu metot içerisinde kontrol edilmeyecektir				
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		GetPrimeTest.run();
	}
}

class GetPrimeTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);		

		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return;
			}			

			
			System.out.printf("%d. asal sayı:%d%n", n, NumberUtil.getPrime(n));		 
		}
	}
}

class NumberUtil {
	public static long getPrime(int n)
	{
		//TODO:
	}
	
	public static boolean isPrime(long val)
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;		

		if (val % 7 == 0)
			return val == 7;
		
		for (long i = 11; i * i <= val; i += 2)
			if (val % i == 0)
				return false;
		
		return true;
	}
}