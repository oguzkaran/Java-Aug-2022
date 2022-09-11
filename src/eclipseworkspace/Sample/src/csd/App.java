/*---------------------------------------------------------------------------------------------------------------------
	Metot çağrısında bir argümana ilişkin ifade önce hesaplanır, elde edilen değer argüman olarak metoda geçilir. Birden
	fazla parametreye sahip bir metot çağrısında tüm argümanlara ilişkin ifadeler hesaplanır, elde edilen değerler ile
	metot çağrılır
	
	Anahtar Notlar: Aşağıdaki örnekte *** ile belirtilen deyime ilişkin ifadede kullanılan "compact" çözüm gibi kodlar
	okunabilirliği/algılanabilirliği etkilememelidir. Eğer böyle bir durum varsa ayrı ayrı hesaplanacak şekilde kodlar 
	yazılmalıdır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();	
		
		System.out.println(NumberUtil.sum(a + 2, b - 8)); //***
	}
}

class NumberUtil {
	public static int sum(int a, int b) //error
	{
		return a + b;
	}	
	
	//...
}

