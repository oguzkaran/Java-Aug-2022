/*----------------------------------------------------------------------------------------------------------------------
	Paketler (Packages) ve İsim Arama (Name Lookup):
	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Şehir ismini giriniz:");
		String city = kb.nextLine();
		
		switch (city.toLowerCase()) {
		case "edirne", "istanbul", "balıkesir" -> System.out.println("Marmara bölgesi");			
		case "zonguldak", "sinop", "bolu" -> System.out.println("Batı karadeniz bölgesi");			
		default -> System.out.println("Geçersiz şehir ismi");
		}
	}
}

