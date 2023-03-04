/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden aşağıdaki formatta girilen bilgiyi ayrıştırarak ekrana sonuçları yazdıran programı yazınız:
		<ad soyad>:<ders adı>:<gg/aa/yyyy>:<gg/aa/yyyy>:<arasınav notu>:<final notu>
		Oğuz Karan:Programlamaya Giriş:31/12/2022:15/01/2023:97:98
		Ali Erdem Güngör:29/12/2022:16/01/2023:65:64
		Bengisu Uzun Yenigün:Java ile Uygulama Geliştirme:23.12.2022:10.01.2023:89:100
		Cemil Aksel:Abap Programlama:22.12.2022:17.01.2023:89:90
		Oğuz Karan:Genel Topoloji:31/12/2022:15/01/2023:34:40

		Açıklamalar:
			- Format geçerlilik kontrolü yapılmayacaktır

			- Formatta vize ve final notlarına göre vize * 0.4 + final * 0.6 formülü ile geçme notu hesaplanacak ve sınav
			tarihleri hangi güne geldiği de eklenerek ekrana yazdırılacaktır

			- Ekran çıktısında "Geçti" ya da "Kaldı" bilgisi de olacaktır. Geçme notu 50 ve üstünde ise öğrenci dersi
			geçmiş sayılacaktır

			- Geçme notu round işlemi ile tam sayı olarak elde edilecektir

			Örnek Çıktı:
				-----------------------------------------------------------------------
				Ad Soyad: Oğuz Karan
				Ders Adı: Programlamaya giriş
				Arasınav Tarihi: 31 Aralık 2022 Cumartesi
				Final Tarihi: 15 Ocak 2023 Pazar
				Arasınav Notu: 97
				Final Notu: 98
				Geçme Notu: 98
				Sonuç: Geçti
				-----------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		String str = "Bugün hava çok güzel. Bu güzel havada [Java] çalışalım. İyi bir [[Java]] programcısı olmak için çok çalışmak gerekir";
		String [] words = str.split("[ \\[\\].]+");

		for (int i = 0; i < words.length; ++i)
			System.out.printf("(%s)%n", words[i]);
	}
}

