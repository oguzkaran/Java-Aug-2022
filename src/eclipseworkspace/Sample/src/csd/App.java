/*----------------------------------------------------------------------------------------------------------------------
	String sınıfının compareToIgnoreCase metodu "case insensitive" karşılaştırma yapar
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			int result = s1.compareToIgnoreCase(s2);
			
			System.out.printf("Result:%d%n", result);
			
			if (result < 0)
				System.out.printf("'%s', '%s' yazısından önce gelir%n", s1, s2);
			else if (result > 0)
				System.out.printf("'%s', '%s' yazısından önce gelir%n", s2, s1);
			else
				System.out.printf("'%s', '%s' aynı yazılardır%n", s1, s2);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


