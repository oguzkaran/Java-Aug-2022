/*----------------------------------------------------------------------------------------------------------------------
	Derleyici özdeş "string literal"'lar için aynı nesnenin referansını verecek bir kod üretirler. Yani bir string literal
	ile özdeş kaç tane sabit olursa olsun hepsi için aynı nesnenin referansı elde edilir. Yeniden nesne yaratılmaz. Aşağıdaki
	örnekte yine referans karşılaştırması yapılmıştır. Ancak s1 ve s2'ye atanan string literal'lar özdeş olduğundan aynı
	adresler atanmış olur. Örnek durumu anlatmak için yazılmıştır.
	
	Anahtar Notlar: Derleyicinin ödeş string'ler için aynı adresi vermesi String sınıfının immutable olmasındandır. Aksi
	olsaydı yani String sınıfı immutable olmasaydı aynı adres verildiğinde herhangi bir referans üzerinden değişiklik
	yapılması durumunda diğer referans üzerinden de değişiklik görülebilirdi. Bu durumda String sınıfı kullanan programcı
	açısından karmaşık durumlar oluşabilirdi 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		String s1 = "cemil";		
		String s2 = "cemil";
		
		System.out.println(s1 == s2 ? "Aynı yazı" : "Farklı yazılar");				
	}
}
