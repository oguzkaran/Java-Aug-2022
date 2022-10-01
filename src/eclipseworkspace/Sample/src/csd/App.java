/*---------------------------------------------------------------------------------------------------------------------	
	-- operatörü tek operandlı ve hem prefix hem de postfix olarak kullanılabilen bir operatördür. Bu operatör ister 
	prefix ister postfix olarak kullanılsın operandına ilişkin değeri bir azaltır. Yani operandının içerisindeki değerin
	1 eksiği ile değiştirir. Bu operatörün operandının değişken olması zorunludur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		int a = 10;
		
		a = a + 1;
		
		System.out.printf("a = %d%n", a);	
	}
}
