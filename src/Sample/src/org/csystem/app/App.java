/*-----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Bir kaynaktan (source) karakterler gelsin. Karakterlerin sıra numarası int türden değerler olarak
	verilsin. Artık karakter kalmaması durumunda -1 elde edilsin. Ayrıca karakterler örneğin, kaç tane boşluk karakteri
	olduğunu sayacak, kaç tane harf olduğunu sayacak, karakterleri bir java programı olarak düşünüp atomlarına ayıracak vb.
	uygulamalar yapılabilecektir. Buna göre bu işlemi genelleştiren yani karakterlerin kaynağından bağımsız hale getiren,
	bu karakterler ile ne yapılacağından da bağımsız hale getiren tasarımı yapınız

	Not: Bu tasarım şu ana kadar gördüğümüz konular kullanılarak yapılmıştır. İleride daha iyisi yapılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		A a = new B();
		IX ix;

		ix = (IX)a; //haksız dönüşüm

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class B extends A {
	//...
}

class A  {
	//...
}

interface IX {
	//...
}
