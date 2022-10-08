/*---------------------------------------------------------------------------------------------------------------------	
	Aşağıdaki örneği inceleyiniz (Ömer Faruk CİN'in sorusu)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		boolean result;
		
		result = Sample.bar() || Sample.tar() && Sample.bar() || Sample.foo();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}
