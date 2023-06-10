/*----------------------------------------------------------------------------------------------------------------------
	Arayüzler (interfaces):

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
	public static void main(String[] args)
	{
		Sample s, k;

		s = new Sample();
		Console.writeLine("----------------------------------");
		k = new Sample(10);

		//...
	}
}

class Sample {
	private final int m_x;
	//...
	{
		Console.writeLine("non-static initializer-1");
		m_x = 10;
	}

	{
		Console.writeLine("non-static initializer-2");
		Console.writeLine("m_x = %d", m_x);
	}

	public Sample()
	{
		System.out.println("I am a default ctor of A");
	}

	public Sample(int a)
	{
		this();
		System.out.println("I am a ctor of A with parameter type: int");
	}
	//...
}