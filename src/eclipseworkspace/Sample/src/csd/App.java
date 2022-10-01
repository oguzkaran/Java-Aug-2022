/*---------------------------------------------------------------------------------------------------------------------	
	Aritmetik 4 işlem ve mod operatörleri iki operandlı (binary) ve araek (infix) operatörlerdir. Bu operatörlerin
	ürettikleri değer (product value) işlem sonucunda elde edilen değerdir. Bu operatörlerin yan etkisi (side effect) yoktur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki tane sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		
		System.out.printf("%d %% %d = %d%n", a, b, a % b);
	}
}