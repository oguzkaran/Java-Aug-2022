/*----------------------------------------------------------------------------------------------------------------------
	super ctor sentaksı adından da anlaşılacağı gibi yalnızca ctor içerisinde kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}

class B extends A {
	//...
	public int b;

	public B()
	{
		System.out.println("I am default ctor of B");
	}

	public B(int x)
	{
		super(x);
		System.out.println("I am ctor of B with parameter type int");
	}

	public void foo(int x)
	{
		super(x); //error
	}
}

class A {
	//...
	public int a;

	public A()
	{
		System.out.println("I am default ctor of A");
	}

	public A(int x)
	{
		System.out.println("I am ctor of A with parameter type int");
	}
}