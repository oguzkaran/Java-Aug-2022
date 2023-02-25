/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Aşağıdaki açıklanan metotları StringUtil sınıfı içerisinde yazınız.
	Açıklamalar:
		- Metotların prototipleri aşağıdakşi gbidir:
		public static String [] getRandomTextsTR(Random r, int count, int mim, int bound)
		public static String [] getRandomTextsTR(Random r, int count, int n)

		public static String [] getRandomTextsEN(Random r, int count, int mim, int bound)
		public static String [] getRandomTextsEN(Random r, int count, int n)

		Birinci metot, ikinci parametresi ile aldığı count kadar elemanlı ve her bir elemanı [min, bound) aralığında rasgele
		belirlenmiş Türkçe karakterden oluşan yazıları içeren bir String dizisine geri dönecektir. İkinci metot, ikinci
		parametresi ile aldığı count kadar elemanlı ve her bir elemanı üçüncü parametresi ile aldığı n değeri kadar rasgele
		belirlenmiş Türkçe karakterlerden oluşan yazıları içeren String dizisine geri dönecektir. Son iki metot İngilizce
		karakterlerden oluşan String dizisine geri dönen versiyonlarıdır.

		- Metotlar için yazılmış test kodlarını çalıştırınız
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.app.date.DateApp;

class App {
	public static void main(String [] args)
	{
		DateApp.run();
	}
}

