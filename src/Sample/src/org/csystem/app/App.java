/*----------------------------------------------------------------------------------------------------------------------
	Java'da exception sınıfları kategori olarak iki gruba ayrılır: checked, unchecked

	unchecked exception sınıfı: Bir exception sınıfının türetme hiyerarşisi içerisinde RuntimeException veya Error
	sınıfı varsa bu exception sınıfı unchecked bir exception sınıfıdır

	checked exception sınıfı: unchecked olmayan exception sınıflarıdır

	Anahtar Notlar: Bir exception sınıfının checked veya unchecked bir exception sınıfı olmasının çalışma zamanı açısından
	bir farkı yoktur. Yani tüm exception sınıfarı için çalışma zamanı durumu aynıdır. Bir sınıfın checked bir exception
	sınıfı olması derleme zamanında bir takım özellikleri (detayları) beraberinde getirir.

	Anahtar Notlar: Exception sınıflarının yazımında genel olarak Throwable sınıfından doğrudan türetme yapılmaz. Throwable
	sınıfından türetme yapıldığında da tanım gereği sınıf checked exception sınıfı olur

	Anahtar Notlar: Türetme kavramı dolayısıyla bir exception sınıfından türetilen bir başka exception sınıfı kategori
	olarak taban sınıfı ile aynıdır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
	public static void main(String[] args)
	{
		try {
			double val = Console.readDouble("Bir sayı giriniz:", "Hatalı giriş yaptınız!...");

			Console.writeLine("log10(%f) = %f", val, MathUtil.log10(val));
		}
		catch (MathException ex) {
			ex.printStackTrace();
		}
	}
}

class MathUtil {
	public static double log10(double val)
	{
		if (val < 0)
			throw new NaNException("Indeterminate");

		if (val == 0)
			throw new NegativeInfinityException("Undefined");

		return Math.log10(val);
	}
}

class NegativeInfinityException extends MathException {
	public NegativeInfinityException(String message)
	{
		super(message, MathExceptionStatus.NEGATIVE_INFINITY);
	}

	public String getMessage()
	{
		return String.format("Message:%s, Status: Negative Infinity", super.getMessage());
	}
}

class NaNException extends MathException {
	public NaNException(String message)
	{
		super(message, MathExceptionStatus.NAN);
	}

	public String getMessage()
	{
		return String.format("Message:%s, Status:NAN", super.getMessage());
	}
}


enum MathExceptionStatus {ZERO, POSITIVE_INFINITY, NEGATIVE_INFINITY, POSITIVE_ZERO, NEGATIVE_ZERO, NAN}

class MathException extends RuntimeException {
	private final MathExceptionStatus m_mathExceptionStatus;

	public MathException(String message, MathExceptionStatus mathExceptionStatus)
	{
		super(message);
		m_mathExceptionStatus = mathExceptionStatus;
	}

	public MathExceptionStatus getMathExceptionStatus()
	{
		return m_mathExceptionStatus;
	}
}

