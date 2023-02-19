/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Sayısal loto kuponu üreten programı yazınız
	(İleride daha iyisi yazılacaktır)
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.app.lottery.NumericLotteryApp;

class App {
	public static void main(String [] args)
	{
		NumericLotteryApp.run();
	}
}

class Util {
	public static char firstNonRepeatingCharacter(String s)
	{
		int [] counts = new int[26];
		int len = s.length();

		for (int i = 0; i < len; ++i)
			++counts[s.charAt(i) - 'a'];

		for (int i = 0; i < len; ++i) {
			char ch = s.charAt(i);

			if (counts[ch - 'a'] == 1)
				return ch;
		}

		return '_';
	}
}