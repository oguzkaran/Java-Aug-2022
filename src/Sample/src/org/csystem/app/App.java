/*-----------------------------------------------------------------------------------------------------------------------
	Generic parametre türünden dizi aşağıdaki gibi yaratılabilir. Aslında tek yöntem bu değildir. Kodda verilen uyarıyı
	dikkate almayınız
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}

class A<T> {
	private T []m_t;

	public A(int count)
	{
		m_t = (T[])new Object[count]; // Uyarıyı görmezden geliniz
	}

	//...
}

