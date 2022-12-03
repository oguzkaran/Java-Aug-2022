/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte tam uyum vardır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		int a = 10;
		short b = 20;
		
		Sample.foo(a, (long)b);
	}
}

class Sample {
	public static void foo() //#1
	{
		System.out.println("foo");		
	}
	
	public static void foo(int a) //#2  
	{
		System.out.println("foo, int");
	}
	
	public static void foo(double a) //#3
	{
		System.out.println("foo, double");
	}
	
	public static void foo(double a, int b) //#4
	{
		System.out.println("foo, double, int");
	}
	
	public static void foo(int b, long a) //#5
	{
		System.out.println("foo, int, long");
	}
	
	public static void foo(short b, long a) //#6
	{
		System.out.println("foo, short, long");
	}
	
	public static void bar(int a, double b) //#7
	{
		System.out.println("bar, int, double");
	}
}

