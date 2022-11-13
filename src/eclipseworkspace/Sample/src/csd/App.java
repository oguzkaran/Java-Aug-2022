/*----------------------------------------------------------------------------------------------------------------------
	Java 12 ile birlikte "preview" olarak "switch expression" dile dahil edilmiştir. Bu durumda switch ifade biçiminde de 
	kullanılabilecek şekilde sentaks ve semantik açıdan geliştirilmiştir. switch'in bu şekildeki kullanımı
	"switch expression statement" olarak da adlandırılabilir. Yani kabaca switch expression semantiği statement biçiminde de
	kullanılabilir. 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		PrintDiamondApp.run();
	}
}


class PrintDiamondApp {
	public static void printAbove(int n)
	{
		for (int i = 1; i < n; ++i) {
			for (int k = 0; k < n - i; ++k)
				System.out.print(' ');
			
			for (int k = 0; k < 2 * i - 1; ++k)
				System.out.print('*');
			
			System.out.println();			
		}		
	}
	
	public static void printBelow(int n)
	{
		for (int i = 0; i < n; ++i) {
			for (int k = 0; k < i; ++k)
				System.out.print(' ');
			
			for (int k = 0; k < 2 * (n - i) - 1; ++k)
				System.out.print('*');
			
			System.out.println();			
		}		
	}
	
	public static void printDiamond(int n)
	{
		printAbove(n);
		printBelow(n);
	}
		
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		printDiamond(kb.nextInt());
	}
}