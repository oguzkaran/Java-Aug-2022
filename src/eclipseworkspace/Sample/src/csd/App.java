/*----------------------------------------------------------------------------------------------------------------------
	Hiç sonlanmayacak sanılan ancvak öyle olmayan bir döngü örneği. Örnekte i değeri azalarak -2147483648 değerine 
	yani int türünün en küçük değerine geldiğinde artık bir azaltıldığında 2147483647 değeri yani int türünün en büyük
	değeri elde edilir ve döngüden çıkılır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		int i;
		
		for (i = 0; i < 10; --i)
			System.out.println(i);
		
		System.out.printf("i = %d%n", i);
	}
}
