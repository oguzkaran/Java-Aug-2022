/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: switch deyiminin bölümleri içerisinde (case ve default) çok fazla işlem yapılması okunabilirlik/algılanabilirlik
	açısından iyi bir teknik değildir. Bu durumda metot yazıp ilgili bölümlerde çağırmak gerekir. Bunun için net bir sınır
	olmasa da 3-4 satırı geçen kodların yazılamaması gerekir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Posta kodunu giriniz:");
		int postalCode = kb.nextInt();
		
		switch (postalCode) {		
		case 67100:
			System.out.println("Zonguldak Bahçelievler Mahallesi");
			break;
		case 34387:
			System.out.println("İstanbul Mecidiyeköy");
			break;
		default:
			System.out.println("Geçersiz posta kodu");	
			break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

