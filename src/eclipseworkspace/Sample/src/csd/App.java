/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun geri dönüş değeri bir referans olabilir. Bu durumda bu metodun geri dönüş değerine ilişkin return deyimine
	ait ifadenin türünün aynı türden bir referans olması gerekir. Bir metodun parametre değişkeni bir referans olabilir.
	Bu durumda metot aynı türden bir referans ile çağrılabilir. Metoda geçilen referans ile metot içerisinde ilgili nesneye
	erişilmiş olur. Referans parametreli bir metot aldığı referansa ilişkin nesne üzerinde değişiklik yapabilir. Bu durumda
	bu değişiklik metodu çağıran koddaki referans üzerinden yine aynı nesneye erişildiği için görülebilir.
	
	Aşağıdaki örnekte createDate metodu içeride yaratmış olduğu nesnenin referansını geri dönüş değeri olarak vermektedir.
	printDate metodu parametresi ile aldığı Date türden referansın gösterdiği nesneye erişip bilgilerini ekrana yazmaktadır.
	changeDate metodu aldığı referansa ilişkin nesneye erişerek elemanlarını yine parametresi ile aldığı değerler ile
	değiştirmektedir. Şüphesiz createDate ve changeDate metotları tarih kontrollerini de yapacaktır. Örnekte bu durum
	//... biçiminde gösterilmiştir. Örneği çalıştırarak durumu gözlemleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		Date date = DateUtil.createDate(11, 7, 1983);
		
		DateUtil.printDate(date);		
		DateUtil.changeDate(date, 6, 9, 2021);
		DateUtil.printDate(date);
	}
}

class DateUtil {
	public static void changeDate(Date date, int day, int month, int year)
	{
		//...
		
		date.day = day;
		date.month = month;
		date.year = year;
	}
	
	public static Date createDate(int day, int month, int year)
	{
		//...
		
		Date date = new Date();
		
		date.day = day;
		date.month = month;
		date.year = year;
		
		return date;				
	}
	
	public static void printDate(Date date)
	{
		System.out.printf("%02d/%02d/%04d%n", date.day, date.month, date.year);		
	}
}

class Date {
	public int day, month, year;

	//...
}
