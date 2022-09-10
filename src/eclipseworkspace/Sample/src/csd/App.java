/*----------------------------------------------------------------------------------------------------------------------
	 Bir metodun geri dönüş değeri bilgisi yerine bir tür ismi yazılırsa bu metodun "geri dönüş değeri" vardır denir.
	 Tersine bir metodun geri dönüş değeri varsa geri dönüş değeri bilgisi yerine bir tür yazılır. Bir metodun geri dönüş
	 değeri varsa, metot çağrısı bittikten sonra çağrıldığı noktaya bir değer ile geri döner. Bir metodun geri dönüş değeri
	 yoksa geri dönüş bilgisi yerine void anahtar sözcüğü yazılır. Bir metodun geri dönüş değeri metot içerisinde return 
	 deyimi ile oluşturulur. return deyiminin genel biçimi şu şekildedir:
	 	 
	 	return [ifade];
	 
	 return deyimi nasıl kullanılırsa kullanılsın metodu sonlandırır. Yani metot içerisinde akış return deyimine 
	 geldiğinde metot sonlanır ve akış çağrılan noktaya geri döner. return deyimine ilişkin ifadenin değeri çağıran
	 metoda aktarılır. Aşağıdaki örnekte sum metodunun geri dönüş değeri 2 ile çarpılmış ve sonuç result değişkenine
	 atanmıştır.  	 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		int result;
		
		result = Util.sum() * 2;
		System.out.println(result);		
	}
	
}

class Util {
	public static int sum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		int b = Integer.parseInt(kb.nextLine());
		
		int result = a + b;
		
		return result;
	}
}



