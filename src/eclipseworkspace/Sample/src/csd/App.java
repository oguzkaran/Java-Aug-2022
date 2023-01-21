/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir yazının palindrom olup olmadığını test eden isPalindrome isimli metodu 
	yazınız ve aşağıdaki kod ile test ediniz.
	
	Palindrom: Yalnızca alfabetik karakterleri tersten okunduğunda aynı olan yazılara denir. Detaylar gözardı edilerek
	bu tanım yapılabilir
	
	Örnekler:
	Ey Edip Adana'da pide ye	-> eyedipadanadapideye
	Anastas mum satsana 		-> anastasmumsatsana
	Ali Papila 					-> alipapila
	
	Not: İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		IsPalindromeTest.run();
	}
}

class IsPalindromeTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.printf(StringUtil.isPalindrome(s) ? "Palindrom" : "Palindrom değilk");			
		}		
	}
}

class StringUtil {	
	public static boolean isPalindrome(String s)
	{
		//TODO:
	}
}
