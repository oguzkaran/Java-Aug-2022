package org.csystem.util.string.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;
import static org.csystem.util.string.StringUtil.getRandomTextsEN;

class GetRandomTextsENTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Input min and bound values:");
		int min = kb.nextInt();
		int bound = kb.nextInt();
		
		for (;;) {
			System.out.print("Input count:");
			int count = Integer.parseInt(kb.nextLine());
			
			if (count < 1)
				break;

			print(getRandomTextsEN(r, count, min, bound));
			int n = r.nextInt(min, bound);

			System.out.printf("n = %d%n", n);
			print(getRandomTextsEN(r, count, min, bound));
			print(getRandomTextsEN(r, count, n));
		}
	}

	public static void main(String [] args)
	{
		run();
	}
}
