/*-----------------------------------------------------------------------------------------------------------------------
	Generic sınıfların generic bir parametresi türünden static veri elemanı olamaz. Çünkü generic açılımlar tür farklılığı
	yaratmaz. Dolayısıyla anlamsızdır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}

class Sample<T> {
	public static int x;
	public static T y; //error
}

