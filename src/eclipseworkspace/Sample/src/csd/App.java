/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir n değeri için n tane rasgele üretilmiş Türkçe alfabedeki
	karakterlerden oluşan bir yazı döndüren getRandomTextTR ile n tane rasgele üretilmiş İnglizce alfabedeki
	karakterlerden oluşan bir yazı döndüren getRandomTextEN metotlarını StringUtil sınıf içerisinde yazını ve aşağıdaki
	kod ile test ediniz 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		GetRandomTextTest.run();
	}
}

class GetRandomTextTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n < 1)
				break;
			
			System.out.printf("Şifre:%s%n", StringUtil.getRandomTextTR(n));
			System.out.printf("Password:%s%n", StringUtil.getRandomTextEN(n));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class StringUtil {	
	public static String getRandomTextTR(int n)
	{
		//TODO:
	}	
	
	public static String getRandomTextEN(int n)
	{
		//TODO:
	}
}

