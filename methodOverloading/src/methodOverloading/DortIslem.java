package methodOverloading;


public class DortIslem {
	
	public static int Topla(int sayi1,int sayi2) {
		return sayi1 + sayi2;		
	}
	
	public static int Topla2(int s1,int s2,int s3) {
		return s1+s2+s3;
		}
	
	public static int Topla3(int...sayilar) {
		int toplam = 0;
		for (int i : sayilar) {
			toplam+=i;
		
		}
		return toplam;
	}

	
}
