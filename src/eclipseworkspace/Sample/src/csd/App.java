/*----------------------------------------------------------------------------------------------------------------------
	 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		FindPosNegSumCountsApp.run();		
	}
}

class FindPosNegSumCountsApp {
	public static void printPositivesResult(int posSum, int posCount)
	{
		if (posCount != 0)
			System.out.printf("%d tane pozitif sayının toplamı:%d%n", posCount, posSum);
		else
			System.out.println("Hiç pozitif sayı girmediniz!...");
	}
	
	public static void printNegativesResult(int negSum, int negCount)
	{
		if (negCount != 0)
			System.out.printf("%d tane negatif sayının toplamı:%d%n", negCount, negSum);
		else
			System.out.println("Hiç negatif sayı girmediniz!...");
	}
	
	public static void printResult(int posSum, int posCount, int negSum, int negCount)
	{
		printPositivesResult(posSum, posCount);
		printNegativesResult(negSum, negCount);
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Sayıları girmeye başlayınız:");	
		
		int posCount, posSum, negCount, negSum;
		
		posCount = negCount = 0;
		posSum = negSum = 0;
		
		int val;
		
		System.out.print("Bir sayı giriniz:");
		while ((val = Integer.parseInt(kb.nextLine())) != 0) {
			if (val > 0) {
				posSum += val;
				++posCount;				
			}
			else {
				negSum += val;
				++negCount;
			}
				
			System.out.print("Bir sayı giriniz:");
		}
		
		printResult(posSum, posCount, negSum, negCount);
	}			
}