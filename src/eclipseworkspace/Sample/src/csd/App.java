/*----------------------------------------------------------------------------------------------------------------------
	Tür dönüştürme operatörü
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir tamsayı giriniz:");
		long a = kb.nextLong();
		int b;
		
		b = (int)a;
		
		System.out.printf("b = %d%n", b);		
	}
}

