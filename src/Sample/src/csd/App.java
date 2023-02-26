/*----------------------------------------------------------------------------------------------------------------------
	Homework-008-6. sorunun bir çözümü
	(Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş olan konulara göre yazılmıştır)
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