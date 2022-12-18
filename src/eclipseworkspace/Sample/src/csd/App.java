/*----------------------------------------------------------------------------------------------------------------------
	Random sınıfında Java 17 ile birlikte dolaylı olarak iki tane int türden parametreli bir nextInt metodu da buklunmaktadır	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Random r = new java.util.Random();
		
		for (int i = 0; i < 15; ++i)
			System.out.printf("%d ", r.nextInt(10, 21));//[10, 20]
		
		System.out.println();
	}
}

