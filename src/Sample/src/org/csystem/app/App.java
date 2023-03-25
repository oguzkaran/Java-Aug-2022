/*----------------------------------------------------------------------------------------------------------------------
	enum class'lar enum anahtar sözcüğü ile bildirilir. enum sınıfı içerisinde ilk noktalı virgülden önce (noktalı virgülün
	zorunlu olduğıu durumlar vardır. Zorunlu değilse koymayacağız) bildirilen isimlere "enum sabitleri (enum constants)"
	denir. Bu isimler public, static ve finak olarak bildirilmiş o enum sınıfı türünden referanslardır. Bu referansların
	herbiri ilgili enum sınıfı türünden yaratılmış olan bir nesnenin adresini tutar. enum sabitleri için public, static,
	final ve tür bilgisi yazılması geçersizdir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		BirthDateApp.run();
	}
}

class BirthDateApp {
	public static void run()
	{
		//...
		Date date = new Date();

		date.setMonth(Month.SEP);
		//...
	}
}

enum Month {
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
}


class Date {
	private int m_month;

	//...

	public void setMonth(Month month)
	{
		//...
	}

	//...
}


