/*----------------------------------------------------------------------------------------------------------------------
	- Sınıf türünden bellekte ayrılan bir alana o sınıf türünden nesne (object) denir
	
	- Nesneler heap'de yaratılır. Java'da stack'te nesne yaratılamaz
	
	- Java'da nesnenin kendisini değil, adresini, adresi ile aynı türden bir referansta tutulabilir
	
	- Bir nesneyi yaratmak için new operatörü kullanılır. new operatörünün kullanımının genel biçimi:
		new <sınıf ismi>([argümanlar]);
	new operatörü özel amaçlı, tek operandlı (unary) ve önek (prefix) durumunda bir operatördür. new operatörü
	nesne yaratılması adımları tamamlandıktan sonra hewp'te yaratılmış olan nesnenin adresini (referansını) üretir. 
	Bu durumda bu operatörün ürettiği değer yani adres aynı türden bir referansa atanabilir 
	
	- Bir nesne ilgili sınıf türünden bir örnektir. Buna "instance" da denir
	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		Sensor s; //s bir referans (değişken)
		Person p; //p bir referans (değişken)
		Customer c; //c bir referans (değişken)
		
		s = new Sensor();
		p = new Person();
		c = new Customer();
	
		//...
	}
}

class Sensor {
	//...
}

class Person {
	//...
}

class Customer {
	//...
}