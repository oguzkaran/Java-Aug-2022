/*----------------------------------------------------------------------------------------------------------------------
	while döngüsü ile n-kez dönen döngü:
	
	Örneğin n = 4 olsun
	Koşul kontrolleri							: 4 > 0 -> 3 > 0 -> 2 > 0 -> 1 > 0 -> 0 > 0 
	Döngü içerisinde her adımda n'nin değeri	: 3 -> 2 -> 1 -> 0  
	Sayaç									 	: 1 -> 2 -> 3 -> 4
	Döngü sonrası n'nin değeri					: -1
	
	Bu döngüde n-nin değerinin döngünün her adımında değiştiğine, dolayısıyla döngü sonrasında döngü öncesindeki değerin
	kaybedildiğine dikkat ediniz. Bu döngü kullanılacaksa ve döngüden sonra n-nin eski değerine ihtiyaç olacakse döngü
	öncesinde n-nin değeri saklanmalıdır. Bu kalıbın kullanılacağı zorunlu durumlar yoktur. Ancak bazı programcılar bu
	kalıbı kullanabilirler. Böyle bir kodun anlaşılmas açısında bu kalıp bilinmelidir  
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		while (n-- > 0)			
			System.out.printf("%d ", n);		
			
		System.out.println();		
		System.out.printf("Döngü sonrası n = %d%n", n);
	}
}

