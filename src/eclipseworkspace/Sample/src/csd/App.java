/*----------------------------------------------------------------------------------------------------------------------
	Homework-005-3. sorunun bir çözümü
	(Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş olan konulara göre yazılmıştır)	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		AreFriendsTest.run();
	}
}

class AreFriendsTest {
	public static void run()
	{
		AreFriends3DigitsTest.run();
		AreFriends4DigitsTest.run();
	}
}

class AreFriends4DigitsTest {
	public static void run()
	{
		System.out.println("4 basamaklı arkadaş sayılar:");
		
		for (int a = 1000; a <= 9999; ++a)
			for (int b = a + 1; b <= 9999; ++b)
				if (NumberUtil.areFriends(a, b))
					System.out.printf("(%d, %d)%n", a, b);
		
	}
}


class AreFriends3DigitsTest {
	public static void run()
	{
		System.out.println("3 basamaklı arkadaş sayılar:");
		
		for (int a = 100; a <= 999; ++a)
			for (int b = a + 1; b <= 999; ++b)
				if (NumberUtil.areFriends(a, b))
					System.out.printf("(%d, %d)%n", a, b);
		
	}
}

class NumberUtil {
	public static boolean areFriends(int a, int b)
	{
		return sumFactors(a) == b && sumFactors(b) == a;
	}
	
	public static int sumFactors(int val)
	{
		int result = 1;
		int sqrtVal = (int)Math.sqrt(val);
		
		for (int i = 2; i <= sqrtVal; ++i)
			if (val % i == 0)
				result += (i == val / i) ? i : (i + val / i);
		
		return result;
	}
}

