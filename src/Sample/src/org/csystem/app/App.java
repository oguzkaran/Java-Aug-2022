/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte hem dizi referansı hem de mantıksal oalrak dizi nesnesi gizlenmiştir. Bu durumda yine içsel olarak
	tutulan dizide değişiklik yapılamaz. Örnekte dikkat edilirse müşteri kod açısından içeride dizi tutulup tutulmadığının
	bir önemi yoktur
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.app.generator.random.array.RandomArrayGeneratorApp;

class App {
	public static void main(String [] args)
	{
		RandomArrayGeneratorApp.run();
	}
}

