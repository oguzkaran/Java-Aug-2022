/*----------------------------------------------------------------------------------------------------------------------
	Programlamada genelleştirme açısından türden bağımsız (type independent) kod istenir. Aslında programlamada temel amaç
	programa yapılacak eklentiler durumunda eski kodlara en az şekilde dokunmaktır. Şöyle bir genel kural benimsenebilir:
	"Bir programın ilerleyen bir versiyonunda senaryosu değişmedikten sonra eski yazılmış kodlara ne kadar az müdahale edilmesi
	gerekiyorsa, kod o kadar iyi (kaliteli) yazılmıştır". İşte bu sebeple türden bağımsız kod yazmak programa eklenecek örneğin
	sınıfların bir lego'nun parçası gibi diğer parçalara dokunmadan eklenmesini sağlar.


----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		B b = new B();

		b.x = 10;
		b.y = 20.5;

		System.out.printf("b.x = %d%n", b.x);
		System.out.printf("b.y = %f%n", b.y);

		A a = b;

		System.out.printf("a.x = %d%n", a.x);
		++a.x;
		System.out.printf("a.x = %d%n", a.x);
		System.out.printf("b.x = %d%n", b.x);
		System.out.printf("b.y = %f%n", b.y);
	}
}

class B extends A {
	//...
	public double y;
}

class A {
	//...
	public int x;
}

