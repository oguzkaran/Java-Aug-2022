package org.csystem.app.date;

public class DateUtil {	
	public static void printDateTR(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		if (dayOfWeek == -1) {
			System.out.println("Geçersiz tarih");
			return;
		}
		
		printDateByDayOfWeekTR(day, month, year, dayOfWeek);	
		
		System.out.println(isWeekend(day, month, year) ? "Bugün kurs var. Tekrar yaptınız mı?" : "Kurs günü yaklaşıyor. Tekrar yapmayı unutmayınız!...");		
	}
	
	public static void printDateByDayOfWeekTR(int day, int month, int year, int dayOfWeek)
	{
		switch (dayOfWeek) {
		case 0 -> System.out.printf("%02d/%02d/%04d Pazar%n", day, month, year);			
		case 1 -> System.out.printf("%02d/%02d/%04d Pazartesi%n", day, month, year);						
		case 2 -> System.out.printf("%02d/%02d/%04d Salı%n", day, month, year);			
		case 3 -> System.out.printf("%02d/%02d/%04d Çarşamba%n", day, month, year);			
		case 4 -> System.out.printf("%02d/%02d/%04d Perşembe%n", day, month, year);						
		case 5 -> System.out.printf("%02d/%02d/%04d Cuma%n", day, month, year);			
		case 6 -> System.out.printf("%02d/%02d/%04d Cumartesi%n", day, month, year);			
		}
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		int totalDays;		
		
		return (year < 1900 || (totalDays = getDayOfYear(day, month, year)) == -1) ? -1 : (getTotalDays(year, totalDays) % 7);
	}
	
	public static int getTotalDays(int year, int totalDays)
	{
		for (int y = 1900; y < year; ++y)
			totalDays += isLeapYear(y) ? 366 : 365;		
		
		return totalDays;
	}
	
	public static boolean isWeekend(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		return dayOfWeek == 0 || dayOfWeek == 6;
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
			total += isLeapYear(year) ? 29 : 28;			
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
		return switch (month) {
		case 4, 6, 9, 11 -> 30;		
		case 2 -> isLeapYear(year) ? 29 : 28;		
		default -> 31;
		};	
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}