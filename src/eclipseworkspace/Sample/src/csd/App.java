/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile int türden gün, ay ve yıl bilgilerine ilişkin tarihin geçerli olup olmadığını 
	test eden isValidDate isimli metodu yazını ve aşağıdaki kod ile test ediniz
	(İleride daha iyisi yazılacaktır)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		IsValidDateTest.run();
	}
}

class IsValidDateTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.println("Gün ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0)
				break;
			
			if (DateUtil.isValidDate(day, month, year))
				System.out.printf("%02d/%02d/%04d tarihi geçerlidir%n", day, month, year);
			else
				System.out.println("Geçersiz tarih");
		}
		
		System.out.println("Tekrar yapıyor munuz?");
	}
}

class DateUtil {
	public static boolean isValidDate(int day, int month, int year)
	{
		//TODO:
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}