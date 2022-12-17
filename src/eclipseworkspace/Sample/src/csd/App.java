/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Katsayıları klavyeden alınan ikinci dereceden bir denklemin köklerini bulup ekrana yazdıran
	programı yazınız.
	
	Aşağıdaki örneği inceleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		QuadraticEquationSolverApp.run();
	}
}

class QuadraticEquationSolverApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Katsayıları giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		
		QuadraticEquation result =  new QuadraticEquation();
		
		result.solve(a, b, c);
		
		if (result.exists)
			System.out.printf("x1 = %f, x2 = %f%n", result.x1, result.x2);
		else
			System.out.println("Gerçek kök yok");
	}
}

class QuadraticEquation {
	public double x1, x2;
	public boolean exists;
	
	public static double calculateDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public void doWorkForRoots(double delta, double a, double b)
	{
		double sqrtDelta = Math.sqrt(delta);	
		
		x1 = (-b + sqrtDelta) / (2 * a);
		x2 = (-b - sqrtDelta) / (2 * a);
		exists = true;
	}	
	
	
	
	public void solve(double a, double b, double c)
	{
		double delta = calculateDelta(a, b, c);		
		
		if (delta >= 0)
			doWorkForRoots(delta, a, b);		
	}
}

