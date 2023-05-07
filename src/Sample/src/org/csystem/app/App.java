/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Dinamik ömürlü bir bellek alanının kullanılamaz durumda olup yok edilmemesi durumuna
	"bellek sızıntısı (memory leak)" denir. BAzı programlama dillerinde dinamik tahsis edilen alanların yok edilmesi
	yani "free/delete" edilmesi programcının sorumluluğundadır. Bu tarz programlama dillerinde programcı dinamik tahsis
	edilmiş bir alanı geri bırakmazsa, bu alan programın sonuna kadar yaşar. Yani bu durum çolk fazla olursa zamanla
	bellek alanı yetmemesine yol açabilir. Java'da madem ki GC var, bu durumda bellek sızıntısı olabilir mi? GC ile
	çalışan ortamlarda bellek sızıntısı programcının hatalı kodlar yazmasından dolayı oluşabilir. Örneğin, programcı
	bir veya birden fazla nesnenin referansını programın sonuna kadar yaşayacak (örneğin static veri elemanları)
	referans değişkenlerde saklar ve bu referans değişkenleri kullanmaz duruma geldiğinde nesnelerin sayaçları hiç bir zaman
	sıfır değerine gelemeyeceğinden bellek sızıntısı oluşur. Yani aslında Java'da bellek sızıntısı GC'den dolayı oluşmaz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s;

		s = new Sample(); //rc1: 1

		{
			Sample k;

			k = s; //rc1:2

			Mample.foo(k); //rc1:3 -> rc1:4
			//rc1:3 -> rc1:2
		} //rc1:1

		s = new Sample(); //rc1:0 (garbage collected), rc2:1

		System.gc(); //Runtime.getRuntime().gc();
		//...
	}
}

class Mample {
	public static void foo(Sample s)
	{
		Sample k;

		//...

		k = s;

		//...
	}
}

class Sample {
	//...
}


