/*---------------------------------------------------------------------------------------------------------------------	
	 Aşağıdaki örnekte atama operatörünün operandının değişken olmamasından dolayı error oluşur. Burada ikinci atama 
	 operatörünün operandının değişken olmaması durumu vardır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		int a, b, c;		
		
		
		b = c;
		
		//a = (b = c) = 10;
		
		System.out.printf("a = %d%n", a);		
		System.out.printf("b = %d%n", b);
		System.out.printf("c = %d%n", c);
	}
}