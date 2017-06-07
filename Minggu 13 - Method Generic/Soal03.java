package PackageHemat;

/*
 * NIM   : 10115088
 * Nama  : Fajar Abdi Nugraha
 * Kelas : ProLan - 12
 */

public class Soal03 {
	
	private static <T> Object Try(T type) {
		return type;
	}
	
	private static <T> void print(T type) {
		System.out.println(type);
	}
	
	public static void main(String[] args) {
		
		objectClass oC = new objectClass(); // Kelas objectClass alokasinya harus diwadahi dahulu
											//Agar saat di setter oleh try datanya berubah
		
		Try(oC.setAttribut("PROLAN -12"));
		print(oC.getAttribut());
		
	}

}
