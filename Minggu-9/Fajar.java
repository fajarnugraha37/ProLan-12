/*
 * NIM   : 10115088
 * Nama  : Fajar Abdi nugraha
 * Kelas : ProLan - 12
*/

public class Fajar extends Mahasiswa {
	
	@Override
	public void kuliah(){
		System.out.println("Kuliah itu harus daftar ke Universitas");
	}
	
	@Override
	public void lulus(){
		System.out.println("Lulusnya tepat waktu dan menguasai ilmunya dengan baik");
	}
	
	@Override 
	public void tidaklulus(){
		System.out.println("Tidak Mau tidak lulus");
	}
}