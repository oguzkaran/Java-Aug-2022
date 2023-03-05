/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir matrisin tüm elemanlarını ikinci parametresi ile aldığı int
	türden değer ile toplayan addBy, çıkartan subtractBy ve çarpan multiplyBy isimli metotları MatrixUtil isimli
	sınıf içerisinde yazınız ve aşağıdaki kodlar ile test ediniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String[] args)
    {
        IsIdentifierTest.run();
    }
}

class IsIdentifierTest {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for (;;) {
            System.out.print("Değişken ismini giriniz:");
            String s = kb.nextLine();

            System.out.println(StringUtil.isIdentifier(s) ? "Geçerli" : "Geçersiz");

            if ("elma".equals(s))
                break;
        }
    }
}

class StringUtil {
    public static boolean isIdentifier(String s)
    {
        if (s.isBlank() || s.equals("_"))
            return false;

        char ch = s.charAt(0);

        if (!Character.isLetter(ch) && ch != '_' && ch != '$')
            return false;

        int len = s.length();

        for (int i = 1; i < len; ++i) {
            ch = s.charAt(i);

            if (!Character.isLetter(ch) && !Character.isDigit(ch) && ch != '_' && ch != '$')
                return false;
        }

        return true;
    }
}