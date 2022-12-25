/*----------------------------------------------------------------------------------------------------------------------
	ctor aşağıdaki özelliklere sahip bir metottur:
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		int min = 10, bound = 21;
				 
		for (int i = 0; i < 10; ++i)
			System.out.println((int)(Math.random() * (bound - min) + min));
	}
}

