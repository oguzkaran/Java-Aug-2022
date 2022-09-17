/*---------------------------------------------------------------------------------------------------------------------
	Gerçek sayılar ile bölme işleminde payda sıfır olsa bile işlem myapılıor. Yani exception oluşmaz. Gerçek sayılar 
	içerisinde genel olarak Matematik'teki "belirsizlik" için kullanılan "Not a Number (NaN)" değeri vardır. Ayrıca
	genel olarak sonsuzluk (Matematik'teki tanımsızlık) için kullanılan -Infinity ve +Infinity değerleri de vardır.
	Bu özel değerler dışında da başka özel değerler bulunmaktadır. Bu durumda gerçek sayılar ile bölme işleminde pay
	sıfırdan farklı, payda sıfır ise payın işaretine göre +Infinity veya -Infinity, pay ve paydanın her ikisi birden
	sıfır ise NaN sonucu elde edilir.
	
	Aşağıdaki örneği çeşitli değerler girerek çalıştırıp sonuçları gözlemleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("2 tane sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		
		double result = a / b;
		
		System.out.printf("%f / %f = %f%n", a, b, result);
	}
}


