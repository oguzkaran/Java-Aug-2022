/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden kullanıcı adı ve şifre isteyen basit bir ATM uygulamasının bir parçasını aşağıdaki
	açıklamalara göre yazınız.
	Açıklamalar:
	- Kullanıcı adı ve şifresi en fazla 3 kez denenebilecektir
	- Denemeler sırasında doğru giriş yapılırsa "Giriş Başarılı", başarısız denemeler için "Giriş başarısız!... 2 deneme hakkınız kaldı"
	biçiminde yazılar basılacaktır
	- En fazla 3 deneme sonunda başarısız olunmuşsa "Giriş başarısız!... Artık deneme hakkınız bitti!..." yazısı
	basılacaktır
	- Kullanıcı adı ve şifrenin doğruluğu program içerisinde belirlenen bir kullanıcı adı ve şifre ile yapılacaktır
	- Uygulamayı genel düşünerek yapmayta çalışınız
	- ATM uygulamasının sürekli çalıştığı varsayımıyla uygulamanızı yazınız
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		Complex z1 = new Complex(3, 4);
		Complex z2 = new Complex(-9, 6);		
		Complex z;
		
		z = z1.add(z2);		
		z.print();
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
		return new Complex(re1 * re2 - im1 * im2, re1 * im2 + re2 * im1);
	}
	
	public static Complex divide(double re1, double im1, double re2, double im2)
	{			
		Complex z = multiply(re1, im1, re2, -im2);
		double divider = re1 * re1 + im1 * im2;
		
		z.real /= divider;
		z.imag /= divider;
		
		return z;
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
	
	public void add(Complex result, Complex other)
	{
		result.real = real + other.real;
		result.imag = imag + other.imag;
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
	
	public static Complex multiply(double val, Complex z)
	{
		return multiply(val, 0, z.real, z.imag);
	}
	
	public Complex multiply(Complex other)
	{
		return multiply(real, imag, other.real, other.imag);
	}
	
	public Complex multiply(double val)
	{
		return multiply(real, imag, val, 0);
	}

	public static Complex divide(double val, Complex z)
	{
		return divide(val, 0, z.real, z.imag);
	}
	
	public Complex divide(Complex other)
	{
		return divide(real, imag, other.real, other.imag);
	}
	
	public Complex divide(double val)
	{
		return divide(real, imag, val, 0);
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
