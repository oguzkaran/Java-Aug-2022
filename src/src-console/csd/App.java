/*----------------------------------------------------------------------------------------------------------------------
	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;
import java.io.File;
class App {
	public static void main(String [] args) 
	{
		System.out.println("App.main");		
		msd.Sample.foo();
		msd.Sample.main(args);
	
	        String projeDizini = "C:\\Users\\ekrem\\OneDrive\\Masaüstü\\AirlineTicketSystem\\AirlineTicket"; // Projeyi temsil eden ana dizini buraya girin
	        File dizin = new File(projeDizini);
	        int dosyaSayisi = JavaDosyaSayaci.dosyaSayisiniBul(dizin);
	        System.out.println("Proje içindeki Java dosya sayısı: " + dosyaSayisi);
	    
	}	
} 


class JavaDosyaSayaci {
    public static int dosyaSayisiniBul(File dizin) {
        int dosyaSayisi = 0;

        if (dizin.isDirectory()) {
            File[] dosyalar = dizin.listFiles();

            if (dosyalar != null) {
                for (File dosya : dosyalar) {
                    if (dosya.isFile() && dosya.getName().endsWith(".java")) {
                        dosyaSayisi++;
                    } else if (dosya.isDirectory()) {
                        dosyaSayisi += dosyaSayisiniBul(dosya);
                    }
                }
            }
        }

        return dosyaSayisi;
    }


}







