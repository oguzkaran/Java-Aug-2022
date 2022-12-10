/*----------------------------------------------------------------------------------------------------------------------
	Bir nesnenin bellekte kapladığı "en az non-static veri elemanlarının toplam uzunluğu kadardır". Bu durumda aynı 
	türden nesneler için aynı uzunlukta yer ayrılır. Farklı türden nesneler için farklı veri elemanları olabileceğinden
	aynı uzunlukta yer ayrılması gerekmez. 
	
	Türü ne olursa olsun tüm referansların uzunlukları aynıdır. Bu da adreslenebilecek sayıları tutabilecek uzunlukturç 
	Örneğin 64 bit sistemlerde tüm referanslar 64 bit (8 byte), 32 bit sistemlerde ise 32 bit (4 byte) uzunluğundadır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		Sample s = new Sample();
		Sample k = new Sample();		
		
		System.out.printf("s.val = %d%n", s.val);
		System.out.printf("s.flag = %b%n", s.flag);
		System.out.printf("k.val = %d%n", k.val);
		System.out.printf("k.flag = %b%n", k.flag);
	}
}

class Sample {
	public int val;
	public boolean flag;
	
	//...
}

