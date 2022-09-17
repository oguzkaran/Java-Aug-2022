/*---------------------------------------------------------------------------------------------------------------------
	printf metodu ile x, X, h, H karakterleri kullanılarak tamsayı türlerine ilişkin değerler hexadecimal olarak 
	formatlanabilir. Ayrıca o (küçük O) format karakteri ile tamsayı türlerine ilişkin değerler octal oalrak formatlanabilir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = Integer.parseInt(kb.nextLine());				
		
		System.out.printf("a = %d%n", a);
		System.out.printf("a = %x%n", a);
		System.out.printf("a = %X%n", a);
		System.out.printf("a = %h%n", a);
		System.out.printf("a = %H%n", a);
		System.out.printf("a = %o%n", a);		
	}
}

