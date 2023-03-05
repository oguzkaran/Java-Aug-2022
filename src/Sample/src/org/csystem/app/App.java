/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte her bir adımda Strişng dizisinin elemanı olan String referansı elde edilmiştir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		String [] names = {"ali", "veli", "selami"};

		for (String name : names)
			System.out.println(name);
	}
}
