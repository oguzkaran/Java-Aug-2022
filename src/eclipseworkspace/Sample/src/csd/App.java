package csd;

class App {
	public static void main(String [] args)
	{
		int a, b, c;
		
		a = 2;
		b = 3;
		
		c = a-- - --b;

		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
		System.out.printf("c = %d%n", c);
		
	}
}
