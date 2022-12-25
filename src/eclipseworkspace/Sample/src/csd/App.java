/*----------------------------------------------------------------------------------------------------------------------
	Complex sınıfı
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		Complex z1 = new Complex(3, 4);
		Complex z2 = new Complex(-9, 6);		
		Complex z;
		
		z = z1.subtract(z2);		
		z.print();		
		System.out.println("---------------------------------------------");
		
		z = z1.subtract(4.5);		
		z.print();
		System.out.println("---------------------------------------------");
		
		z = Complex.subtract(4.5, z);
		z.print();
		System.out.println("---------------------------------------------");
	}
}

class Complex {
	public double real;
	public double imag;
	
	public static Complex add(double re1, double im1, double re2, double im2)
	{
		return new Complex(re1 + re2, im1 + im2);
	}
	
	public static Complex subtract(double re1, double im1, double re2, double im2)
	{
		return add(re1, im1, -re2, -im2);
	}
	
	public static Complex multiply(double re1, double im1, double re2, double im2)
	{
		//TODO:
		return new Complex();
	}
	
	public static Complex divide(double re1, double im1, double re2, double im2)
	{
		//TODO:
		return new Complex();
	}
	
	public Complex()
	{
		
	}
	
	public Complex(double re)
	{
		real = re;
	}
	
	public Complex(double re, double im)
	{
		real = re;
		imag = im;
	}
	
	public double getLength()
	{
		return Math.sqrt(real * real + imag * imag);
	}
	
	public double getNorm()
	{
		return getLength();
	}
	
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.real, z.imag);
	}
	
	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}
	
	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}	
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.real, z.imag);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}
	
	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}	
	
	public Complex getConjugate()
	{
		return new Complex(real, -imag);
	}
	
	public void print()
	{
		System.out.printf("|%.2f + %.2fi| = %f%n", real, imag, getLength());
	}
}

