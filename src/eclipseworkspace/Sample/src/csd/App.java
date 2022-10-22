/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının Armstrong sayısı olup olmadığını test eden isArmstrong
	metodunu NumberUtil sınıfı içerisinde yazınız
	Açıklamalar:
		- Bir sayının her basamağının "basamak sayı"-ncı kuvvetleri toplanmı sayının kendisine eşitse bu sayıya Armstrong
		sayısı denit. Örneğin:
			153 -> 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 153
		
		- Kuvvet alma işlemi için bir önceki örnekte yazılmış olan pow metodu kullanılacaktır
		
		- Negatif sayılar Armstrong sayısı olarak kabul edilmeyecektir
		
		- Metodu, 1 basamaklı, 2 basamaklı, 3 basamaklı, 4 basamaklı, 5 basamaklı ve 6 basamaklı Armstrong sayılarını
		ekrana yazdırarak test ediniz	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		IsArmstrongTest.run();		
	}
}

class IsArmstrongTest {
	public static void run()
	{
		for (int n = -10; n <= 999999; ++n)
			if (NumberUtil.isArmstrong(n))
				System.out.println(n);
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}

class NumberUtil {	
	public static boolean isArmstrong(int val)
	{
		return val >= 0 && getDigitsPowSum(val) == val;
	}
	
	public static int getDigitsPowSum(int val)
	{
		int n = countDigits(val);
		int total = 0;
		
		while (val != 0) {
			total += pow(val % 10, n);
			val /= 10;
		}		
		
		return total;		
	}
	
	public static int countDigits(int val)
	{	
		int count = 0;
		
		do {
			++count;
			val /= 10;
		} while (val != 0);		
		
		return count;
	}
	
	public static int pow(int a, int b)
	{	
		int result = 1;
		
		while (b-- > 0)
			result *= a;
		
		return result;
	}
}
