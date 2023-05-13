/*----------------------------------------------------------------------------------------------------------------------
	Algoritma Kavramı ve Algoritma Analizi:
	Algoritma bir problemin çözümüne ulaştıran doğru adımlara denir. Algoritmaların anlatımında belli bir formal yöntem
	yoktur. Genel olarak sahte kodlar (pseudo codes) kullanılarak açıklanır. Algoritmalar genel olarak dilden bağımsızdır.
	Ancak ince noktalara gelindiğinde algoritmalara da dile bağımlı hale gelir. Örneğin, bir dilde belli bir işi daha kolay
	yapan deyimler bulunabilir. Bu durumda algoritma o deyimlerle implemente edilir.

	Bir algoritmanın işleyişininm incelenmesine "algoritma analizi (analysis of algorithm)" denir. Bu analiz genel olarak
	Matematiksel yöntemler kullanılarak yapılır. İki algoritmanın karşılaştırılabilmesi için kullanılan ölçüye
	"algoritmanın karmaşıklığı (complexity of algorithm)" denir. Algoritmanın karmaşıklığı için temel iki ölçüt kullanılır:
	Hız (speed), kaynak kullanımı (resource usage). Burada baskın ölçüt hızdır. Yani daha çok algoritmalar hızlarına
	göre karşılaştırılır. Ancak bazı durumlarda kaynak kullanımı da gözönüne alınır. Bu durumlar hıza göre az da olsa
	önemli durumlardır. Her iki ölçütün de en iyi olduğu durum çoğu zaman mümkün olmaz.

	Örneğin aşağıdaki gibi yazılmış, en büyük sayıyı bulma algoritması için:
	int [] a = {...};

	int max = a[0];

	for (int i = 1; i < a.length; ++i)
		if (max < a[i])
			max = a[i];

	Burada toplam işlemin sayısı max = a[i] işlemine bağlıdır. Bu algoritma içinm dizinin elemanları bilinmeden bu işlemin
	ne kadar yapıldığı anlaşılamaz. İşte algoritma analizinde işlemlerin sayısı hesaplanırken üç durum dikkate alınır:
	1. Ortalama durum (average case condition)
	2. En kötü durum (worst case condition)
	3. En iyi durum (best case condition)


----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}

