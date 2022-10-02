/*---------------------------------------------------------------------------------------------------------------------	
	Anahtar Notlar: Okunabilirlik/algılanabilirlik açısından tek operandlı operatörleri genel olarak operandına bitişik
	biçimde yazacağız. İki operandlı operatörleri de özel ama önemli olan bazı operatörler dışında operandları ile 
	operatör arasında yalnızca bir tane "space" karakteri olacak şekilde yazacağız
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		int a, b, c;
		
		a = 2;
		b = 3;
		
		c = a++-++b;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
		System.out.printf("c = %d%n", c);
	}
}
