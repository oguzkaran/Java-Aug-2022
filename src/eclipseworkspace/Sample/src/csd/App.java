/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı iki yazıdan birincisi içerisinde ikincisinden kaç tane olduğunu döndüren 
	countString isimli metodu ve büyük -küçük harf duyarsız olarak çalışan countStringIgnoreCase isimli metodu
	yazınız ve aşağıdaki kod ile test ediniz.
	Örneğin
	aaa yazısı içerisinde aa'dan 2 tane vardır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		CountStringTest.run();
	}
}

class CountStringTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			int count = StringUtil.countString(s1, s2);
			
			System.out.printf("Birinci yazıda ikinci yazıdan %d adet var%n", count);
			count = StringUtil.countStringIgnoreCase(s1, s2);
			
			System.out.printf("Birinci yazıda ikinci yazıdan \"case insensitive\" olarak %d adet var%n", count);
		}
		
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class StringUtil {
	public static int countString(String s1, String s2)
	{
		//TODO:
	}
	
	public static int countStringIgnoreCase(String s1, String s2)
	{
		//TODO:
	}
}