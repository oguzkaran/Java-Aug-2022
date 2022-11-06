/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin aşağıdaki açıklamalara
	göre haftanın hangi gününe geldiğini döndüren getDayOfWeek metodunu yazınız ve aşağıdaki kod ile test ediniz.,
	Açıklamalar:
		- Metot geçersiz bir tarih için -1 değerine geri dönecektir
		- 01.01.1900 öncesindeki tarihler geçersiz kabul edilecektir
		- Haftanın günü 01.01.1900 ile verilen tarih arasındaki (verilen tarih dahil) gün sayısının 7(yedi) ile 
		bölümünden elde edilen kalan alınarak belirlenebilir. Buna göre değer sıfır ise "pazar", 1 ise "pazartesi", ...,
		6 ise "cumartesi" günlerine karşılık gelir
		- Bu metot ile birlikte verilen tarihin hafta sonu olup olmadığını test eden isWeekend ve hafta içi olup olmadığını
		test eden isWeekday metotlarını da yazınız. Bu metotlar tarih geçerlilik kontrolü yapmayacaktır
		- İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		GetDayOfYearTest.run();
	}
}

class GetDayOfYearTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Gün ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0)
				break;
			
			DateUtil.printDateTR(day, month, year);			
		}
		
		System.out.println("Tekrar yapıyor munuz?");
	}
}

class DateUtil {	
	public static void printDateTR(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		if (dayOfWeek == -1) {
			System.out.println("Geçersiz tarih");
			return;
		}
		
		printDateTRByDayOfWeek(day, month, year, dayOfWeek);
		
		if (isWeekend(day, month, year))
			System.out.println("Bugün kurs var. Tekrar yaptınız mı?");
		else
			System.out.println("Kurs günü yaklaşıyor. Tekrar yapmayı unutmayınız!...");
	}
	
	public static void printDateTRByDayOfWeek(int day, int month, int year, int dayOfWeek)
	{
		switch (dayOfWeek) {
		case 0:
			System.out.printf("%02d/%02d/%04d Pazar%n", day, month, year);
			break;
		case 1:
			System.out.printf("%02d/%02d/%04d Pazartesi%n", day, month, year);
			break;			
		case 2:
			System.out.printf("%02d/%02d/%04d Salı%n", day, month, year);
			break;
		case 3:
			System.out.printf("%02d/%02d/%04d Çarşamba%n", day, month, year);
			break;
		case 4:
			System.out.printf("%02d/%02d/%04d Perşembe%n", day, month, year);
			break;			
		case 5:
			System.out.printf("%02d/%02d/%04d Cuma%n", day, month, year);
			break;
		case 6:
			System.out.printf("%02d/%02d/%04d Cumartesi%n", day, month, year);			
		}
	}
	
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		//TODO:		
	}
	
	public static boolean isWeekend(int day, int month, int year)
	{
		//TODO:
	}
	
	public static boolean isWeekday(int day, int month, int year)
	{
		return !isWeekend(day, month, year);
	}
	
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return -1;		
		
		int total = day;
		
		switch (month - 1) {
		case 11:
			total += 30;
		case 10:
			total += 31;
		case 9:
			total += 30;			
		case 8:
			total += 31;
		case 7:
			total += 31;
		case 6:
			total += 30;
		case 5:
			total += 31;
		case 4:
			total += 30;
		case 3:
			total += 31;
		case 2:
			total += 28;
			if (isLeapYear(year))
				++total;
		case 1:
			total += 31;		
		}
		
		return total;
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		int days = 31;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2: 
			days = 28;
			if (isLeapYear(year))
				++days;
		}
		
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}