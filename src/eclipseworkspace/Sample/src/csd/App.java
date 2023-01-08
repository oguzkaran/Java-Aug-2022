/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir yazının tersini döndüren reverse isimli metodu StringUtil sınıfı
	içerisinde yazınız ve aşağıdaki kod ile test ediniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		ReverseTest.run();	
	}
}

class ReverseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("Yazının tersi:%s%n", StringUtil.reverse(s));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class StringUtil {
	public static String reverse(String s)
	{
		//TODO
	}
}

