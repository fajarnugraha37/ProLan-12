package paketHemat;

/*
 * NIM	 : 10115088
 * Nama  : Fajar Abdi Nugraha
 * Kelas : ProLan - 12
 * Tugas : Generic class
 */

import java.util.Scanner;

public class mainClass {
	
	private static Scanner read;

	public static void main(String[] args) {
		
		mnjBuku<String>	objBuku = new mnjBuku<>();
		read = new Scanner(System.in);
		String			noBuku;
		String			jdlBuku;
		int				pilihan;
		
		do {
			System.out.println("\n\nSelamat datang di aplikasi Manajemen Buku");
			System.out.println("=========================================\n");
			System.out.println("Menu Pilihan");
			System.out.println("1. Isi Data buku");
			System.out.println("2. Tampil Data Buku");
			System.out.println("4. KELUAR");
			System.out.print("\n    pilihan anda : ");
			pilihan = read.nextInt();
		
			switch (pilihan) {
			case 1: System.out.print("Masukan no buku     : ");
					noBuku    = read.next();
					System.out.print("Masukan judul buku  : ");
					jdlBuku = read.next();
					objBuku.isiData(noBuku, jdlBuku);
					System.out.println("data telah diinput");
					
				break;
			case 2: System.out.println("Data Buku");
					objBuku.tampilData();

				break;
			case 0 : System.out.println("KElUAR");
					 
			    break;
			default: System.out.println("Pilihan yg anda masukan salah silahkan ulangi"); 
				break;
			}
			
		}while(pilihan!=0);
		
	}

}
