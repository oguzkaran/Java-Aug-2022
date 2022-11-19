/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte switch expression, statement biçiminde kullanılmıştır. switch statement karşılığı şu şekildedir:
	switch (code) {
		case 67100:
			System.out.println("Zonguldak Bahçelievler");
			break;
		case 34387:
			System.out.println("İstanbul Mecidiyeköy");
			break;
		default:
			System.out.println("Geçersiz post kodu");				
	}
	
	switch expression'ın fall-through özelliği yoktur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		
		for (;;) {
			System.out.print("Posta kodunu giriniz:");
			int code = Integer.parseInt(kb.nextLine());
			
			if (code <= 0)
				break;
			
			switch (code) {
			case 67100 -> System.out.println("Zonguldak Bahçelievler");
				
			case 34387 -> System.out.println("İstanbul Mecidiyeköy");
				
			default -> System.out.println("Geçersiz post kodu");				
			}
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


