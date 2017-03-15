/*
	NIM   : 10115088
	Nama  : Fajar Abdi Nugraha
	Kelas : ProLan - 12
*/
import java.util.Scanner;


public class IPMahasiswa {
	
	public static void main(String[] args) {
		IPMahasiswa mhs = new IPMahasiswa();
		Scanner read = new Scanner(System.in);
		float ip, jmlIp = 0, rataIp = 0;
		int jmlMhs = 0, jmlLulus = 0, jmlTidakLulus = 0;
		
		System.out.print("Masukkan IP : ");
		ip = read.nextFloat();
		while (ip != -999) {
			if (mhs.isWithinRange(ip, 0, 4) == 1) {
				jmlMhs++;
				jmlIp += ip;
				if (ip >= 2.75) {
					jmlLulus++;
				} else {
					jmlTidakLulus++;
				} // End IF
			} // End IF
			System.out.print("Masukkan IP : ");
			ip = read.nextFloat();
		} // EndWhile
		if (jmlMhs != 0) {
			rataIp = jmlIp / jmlMhs;
			System.out.println("Jumlah Mahasiswa             : " + jmlMhs);
			System.out.println("Jumlah Mahasiswa Lulus       : " + jmlLulus);
			System.out.println("Jumlah Mahasiswa Tidak Lulus : " + jmlTidakLulus);
			System.out.println("Rata - rata IP               : " + rataIp);
		} else {
			System.out.println("Tidak ada data");
		}
		
		
	} // End Procedure Main
	
	int isWithinRange(float x, float min, float max) {
		if (x >= min && x <= max) {
			return 1;
		} else {
			return 0;
		} // End IF
	} // End Function isWithinRange
	
} // End Class IPMahasiswa