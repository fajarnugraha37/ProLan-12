/*
   NIM  : 10115088
   Nama : Fajar Abdi Nugraha
*/

public class AnjingRefisi extends MamaliaRefisi {
	
	public String jenisAnjing;
	public boolean taring;
	public boolean cakar;
	
	AnjingRefisi() {
		super("Anjing");
		System.out.println("ini constructor class AnjingRefisi");
	}
	public void menggonggong() {
		System.out.println("Saya bisa menggonggong");
	}
	public void menggigit() {
		System.out.println("Saya bisa meneggigit");
	}
	public void berlari() {
		System.out.println("Saya bisa berlari");
	}
	
	public static void main(String[] args) {
		AnjingRefisi dog = new AnjingRefisi();
		
		dog.menggonggong();
		dog.menggigit();
		dog.berlari();
		dog.menyusui();
		dog.melahirkan();
	}

}