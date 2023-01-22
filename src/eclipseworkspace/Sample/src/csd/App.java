/*----------------------------------------------------------------------------------------------------------------------
	Paketler (Packages) ve İsim Arama (Name Lookup):
	Aşağıdaki maddelerde "user defined type (UDT)" olarak belirtilen kavram için şu ana kadar ki bilgilerimizle sınıf
	düşünülebilir. Ancak ileride göreceğimiz başka UDT'ler de vardır (enum class, interface vb.).  	
	
	Java kodlarını içeren ve genellikle ".java" uzantılı olan bir dosyaya (derlenen dosya)  "derleme birimi (compilation/translation unit)" 
	denir. Eğer Java dosyasında birden fazla UDT söz konusu ise herbir UDT bir derleme birimi olarak düşünülebilir.
	
	Paketlere ilişkin detaylar:
	- javac her UDT için ayrı bir ".class" uzantılı dosya (byte code) üretir. Bu işlem UDT'ler aynı java dosyasında
	olsa bile bu şekilde yapılır. 
	
	- Bir UDT herhangi bir pakette olabilir. Bir proje içerisinde kullanılan UDT'lerin aynı pakette olma zorunluluğu
	yoktur
	
	- Bir ".class" uzantılı dosyanın dosyaya ilişkin UDT'nin ait olduğu paketle aynı isimde bir dizinde (directory) 
	olması gerekir. Aslında java dosyaları için böyle bir zorunluluk yoktur. Ancak birçok IDE kendi içerisinde bunu da
	zorunlu tutar
	
	- Bir UDT bulunduğu paket dışında (başka bir poaketin içerisinde), paket ismi ve nokta operatörü ile kullanılabilir.
	
	- Bir paket içerisinde bildirilen bir UDT'nin farklı bir paketten kullanılabilmesi için public olarak bildirilmesi
	gerekir. public olarak bildirilmeyen bir UDT ancak aynı paketteki diğer UDT'ler tarafından kullanılabilir. public
	olmayan UDT'ler için "friendly" ya da daha nadir olarak "internal" terimi kullanılır
	
	- Farklı paketteki UDT'ler için byte kodların da uygun yerde olması gerekir. Uygulamanın başlatıldığı dizin tüm paketlere
	ilişkin dizinlerin olması gereken dizindir. Ancak bu durumun da ayrıntıları ve istisnaları vardır
	
	- Uygulamada kullanılan sınıflar içerisinde bir tane main metodu olmak zorunda değildir. Ancak şüphesiz "java" 
	programına verilen byte koda ilişkin sınıfta (bu kesinlikle sınıf olmalıdır) uygun main metodunun olması gerekir.
	main metodunun aşağıdaki yapıda olması zorunludur:
		public static void main(String [] args)
	java programına verilen main metoduna "giriş noktası (entry point)" denir
	
	- public olarak bildirilen bir UDT'nin kendi ismiyle aynı isimde bir java dosyası içerisinde bulunması gerekir. Bu 
	durumda bir java dosyası içerisinde yalnızca o dosya ismiyle aynı isimde bir UDT public olarak bildirilebilir
	
	- Bir java dosyasında public bir UDT olmak zorunda değildir. public bir UDT olacaksa dosya ismi ile aynı isimde bir
	UDT olabilir
	
	- Bir java dosyası içerisinde dosya ismi ile aynı isimde bir UDT olmak zorunda değildir
	
	- Bir java dosyası içerisinde public olmayan istenildiği kadar UDT bildirilebilir. Bu UDT'lerin hepsi aynı pakette
	bildirilmiş olur
	
	- Aynı paket içerisinde aynı isimde birden fazla UDT bildirimi yapılamaz
	
	- Farklı paketler içerisinde aynı isimde UDT bildirimleri yapılabilir
	
	- Bir java dosyasında birden fazla paket bildirimi yapılamaz
	
	- Hiç bir paket bildirimi olmayan java dosyalarında bildirilen UDT'ler "isimsiz paket (unnamed package)" denilen bir
	paket içerisinde bildirilmiş kabul edilirler. Ancak projelerde isimsiz paket içerisinde UDT bildirimi yapılmamalıdır
	
	- 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		
	}
} 



