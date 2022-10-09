package methods;

public class Main {

	public static void main(String[] args) {
		
		String mesaj= "bugün hava çok güzel";
		
		String yeniMesaj = ekle("alper");
		
		System.out.println(yeniMesaj);
		
		int toplam = topla2(4,9,2,8,6);
		System.out.println("sayilarin toplami "+toplam);
	}
	 
	public static String ekle(String isim) {
		
		return "eklendi :"+isim;
		
	}
	public static void sil() {
		System.out.println("silindi");
	}	
	
	public static void guncelle() {
		System.out.println("güncellendi");
		
	}	
	
	// variable arguments 
	public static int topla2(int...sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam ;
	}

}
