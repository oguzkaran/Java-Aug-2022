/*----------------------------------------------------------------------------------------------------------------------
	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		float a = 0.1F, b = 0.2F;
		float c;
		
		c = a + b;
		
		System.out.printf("a = %.20f%n", a);
		System.out.printf("b = %.20f%n", b);
		System.out.printf("c = %.20f%n", c);
		
		
		if (c == 0.3)
			System.out.println("Eşit");
		else		
			System.out.println("Eşit değil");
	}
}

