/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın static veri elemanı 1 tanedir. Bu elemanın kullanılabilmesi için nesne yaratılması gerekmez. Sınıfın static bir
	veri elemanına sınıf dışından sınıf ismi ve nokta operatörü ile erişilebilir. Sınıfın static veri elemanları da 
	yaratıldıklarında default değer alırlar. Sınıfın static veri elemanları sınıfın bir elemanı (metot, veri elemanı vb)
	ilk kez kullanıldığında yaratılır ve programın sonuna kadar yaşarlar. Ayrıntılar ileride ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		System.out.printf("Sample.val = %d%n", Sample.val);
		System.out.printf("Sample.flag = %b%n", Sample.flag);
		
		++Sample.val;
		Sample.flag = true;
		
		System.out.printf("Sample.val = %d%n", Sample.val);
		System.out.printf("Sample.flag = %b%n", Sample.flag);		
	}
}

class Sample {
	public static int val;
	public static boolean flag;
	
	//...
}

