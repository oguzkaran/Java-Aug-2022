/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın non-static veri elemanları her nesne için ayrıca yaratılırlar ve nesnenin içerisinde bulunurlar. Sınıfın
	non-static veri elemanlarına sınıf dışından (yani başka bir sınıfın içinden) referans ve nokta operatörü ile erişilir. 
	Nokta operatörü özel amaçlı, iki operandlı ve araek durumunda bir operatördür. Nokta operatörünün birinci operandı
	bir referans, ikinci operandı bir veri elemanı ise bu durumda nokta operatörü o veri elemanına ilişkin değişkeni üretir.
	Aslında referans ve nokta operatörü ile veri elemanı ismi kullanımı o referansın gösterdiği nesnenin ilgili veri
	elemanına erişmek anlamına gelir. Her new işlemiyle yeni bir nesne yaratıldığını anımsayınız
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		Sample s = new Sample();
		Sample k = new Sample();
		
		s.val = 10;
		s.flag = true;
		
		k.val = 20;
		k.flag = false;
		
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