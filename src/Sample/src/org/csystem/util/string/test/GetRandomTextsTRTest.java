package org.csystem.util.string.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;
import static org.csystem.util.string.StringUtil.getRandomTextsTR;

class GetRandomTextsTRTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("min and bound değerlerini giriniz:");
		int min = kb.nextInt();
		int bound = kb.nextInt();
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int count = Integer.parseInt(kb.nextLine());
			
			if (count < 1)
				break;

			print(getRandomTextsTR(r, count, min, bound));
			int n = r.nextInt(min, bound);

			System.out.printf("n = %d%n", n);
			print(getRandomTextsTR(r, count, min, bound));
			print(getRandomTextsTR(r, count, n));
		}
	}

	public static void main(String [] args)
	{
		run();
	}
}
