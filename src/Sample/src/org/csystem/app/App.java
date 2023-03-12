/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Bazı durumlarda sınıfın public bölümüne ilişkin metotların isminin hatta yapısının da değiştirilmesi
	gerekebilir. Bu durumda sınıfı yazan programcı eski metodu hemen silmez. Metodu "deprecated" duruma getirir ve bunu
	dökumantasyona da yansıtır. Bu durumda eski kodlar derleme anlamında doğrudan etkilenmez. Hatta bazı araçlar ile
	deprecated elemanlar için derleyicinin "warning" vermesi sağlanabilir. Deprecated olmanın gerekçesine göre eski kodlar da
	gerekirse değiştirilir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Date birthDate = new Date(10, 9, 1976);

		System.out.printf("%02d/%02d/%04d%n", birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());
		birthDate.setDay(11);
		birthDate.setMonth(7);
		birthDate.setYear(1983);
		System.out.printf("%02d/%02d/%04d%n", birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());
	}
}

class Date {
	private String m_dateStr;
	private int m_dayOfWeek;

	//...

	public Date(int day, int month, int year)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", day, month, year);
		//Calculate day of week
	}

	public int getDay()
	{
		return Integer.parseInt(m_dateStr.substring(0, 2));
	}

	public void setDay(int day)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", day, getMonth(), getYear());
		//Calculate day of week
	}


	public int getMonthValue()
	{
		return Integer.parseInt(m_dateStr.substring(3, 5));
	}

	public void setMonthValue(int month)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", getDay(), month, getYear());
		//Calculate day of week
	}

	public int getMonth()
	{
		return Integer.parseInt(m_dateStr.substring(3, 5));
	}


	public void setMonth(int month)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", getDay(), month, getYear());
		//Calculate day of week
	}

	public int getYear()
	{
		return Integer.parseInt(m_dateStr.substring(6));
	}

	public void setYear(int year)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", getDay(), getMonth(), year);
		//Calculate day of week
	}

	public int getDayOfWeek()
	{
		return m_dayOfWeek;
	}

	//...
}
