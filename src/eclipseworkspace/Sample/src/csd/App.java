/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki problem aşağıdaki gibi çözülebilir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		int val;
		
		do {
			System.out.print("Bir sayı giriniz:");
			val = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d * %d = %d%n", val, val, val * val);
		} while (val != 0);		
	}
}

