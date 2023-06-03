/*----------------------------------------------------------------------------------------------------------------------
	static bir metot türemiş sınıfta aynı imza ve geri dönüş değeri ile yeniden yazılabilir (burada erişim belirleyici
	erişim anlamında yükseltilebilir ancak düşürülemez). Bu durumda türemiş sınıf ismi kullanıldığında o sınıfın içerisinde
	metot çağrılmış olur

	Anahtar Notlar: Bazı kaynaklar bu duruma "static override" da demektedir. Ancak bu kavramda "override" terimi RTP
	açısından değerlendirilmemelidir. RTP açaısından değerlendirildiğşnde static override kavramı diye bir şey olamaz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		A.foo();
		B.foo();
	}
}

class B extends A {
	public static void foo()
	{
		System.out.println("B.foo");
		A.foo();
	}
}

class A {
	public static void foo()
	{
		System.out.println("A.foo");
	}
	//...
}