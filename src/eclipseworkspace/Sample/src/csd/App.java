/*----------------------------------------------------------------------------------------------------------------------
	Koşul Operatörü (Conditional Operator): 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		System.out.println(Util.e());
	}
}

class Util {
	public static double e()
	{
		double result = 2;
		
		for (int i = 2; i < 10; ++i)
			result += 1D / NumberUtil.factorial(i);
		
		return result;
	}
}


class NumberUtil {
	public static long factorial(int n)
	{
		long result = 1;
		
		for (int i = 2; i <= n; ++i)
			result *= i;		
		
		return result;
	}	
}
