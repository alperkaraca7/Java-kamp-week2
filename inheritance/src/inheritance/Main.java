package inheritance;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * BaseKrediManager baseKrediManager = new BaseKrediManager();
		 * 
		 * baseKrediManager.Hesapla();
		 * 
		 OgretmenKrediManager ogretmenKrediManager= new OgretmenKrediManager();
		 */
		  
		 

		
		KrediUI krediUI = new KrediUI();
		
		krediUI.KrediHesapla(new OgretmenKrediManager());	}

}
