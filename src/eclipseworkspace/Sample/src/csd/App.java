/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Aşağıda açıklanan metotları StringUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	
	public static String padLeading(String s, int len, char ch);
	public static String padLeading(String s, int len);
	public static String padTrailing(String s, int len, char ch);
	public static String padTrailing(String s, int len);
	
	Açıklamalar:
	- padLeading metodunun 3 parametreli overload'u ikinci parametresi ile aldığı len, birinci paramtresi ile aldığı
	yazının uzunluğuğundan büğyükse yazıyı soldan (baştan) üçüncü parametresi ile aldığı karakter ile dolduracaktır.
	Örneğin:
		padLeading("csd", 5, 'x'); 
	çağrısı
		xxcsd
	yazısını döndürecektir
	
	- len uzunluğu yazının uzunluğundan küçük veya eşitse aynı referansa geri dönecektir
	
	- padLeading metodunun 2 parametreli overload'u yazıyı soldan (baştan) space karakteri ile dolduracaktır
	
	- padTrailing metotları benzer şekilde sağdan (sondan) dolduracak şekilde yazılacaktır
	
	- Örneği Java 11 öncesi için yazınız
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		PadLeadingTrailingTest.run();
	}
}

class PadLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();			
			
			if ("elma".equals(s))
				break;
			
			System.out.print("Bir sayı giriniz:");
			int count = Integer.parseInt(kb.nextLine());
			
			System.out.printf("(%s)%n", StringUtil.padLeading(s, count, 'x'));
			System.out.printf("(%s)%n", StringUtil.padLeading(s, count));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, count, 'x'));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, count));			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class StringUtil {
	public static String padLeading(String s, int len, char ch)
	{
		//TODO:
	}
	
	public static String padLeading(String s, int len)
	{
		//TODO:
	}
	
	public static String padTrailing(String s, int len, char ch)
	{
		//TODO:
	}
	
	public static String padTrailing(String s, int len)
	{
		//TODO:
	}
}