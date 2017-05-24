package packageHemat;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		appManajemenBuku Mb   = new appManajemenBuku();
		Scanner			 read = new Scanner(System.in);
		int    pilihan, noBuku, jumBuku;
		final String ESC = "\033[";
		String judulBuku;
		
		do {
			System.out.println("\n\nSelamat datang di aplikasi Manajemen Buku");
			System.out.println("=========================================\n");
			System.out.println("Menu Pilihan");
			System.out.println("1. Isi Data buku");
			System.out.println("2. Tampil Data Buku");
			System.out.println("3. Hapus Seluruh Buku");
			System.out.println("4. KELUAR");
			System.out.print("\n    pilihan anda : ");
			pilihan = read.nextInt();
		
			switch (pilihan) {
			case 1: System.out.print("Masukan no buku     : ");
					noBuku    = read.nextInt();
					System.out.print("Masukan jumlah Buku : ");
					jumBuku   = read.nextInt();
					System.out.print("Masukan judul buku  : ");
					judulBuku = read.next();
					Mb.isiData(noBuku, judulBuku, jumBuku);
					System.out.println("data telah diinput");
					
				break;
			case 2: System.out.println("Data Buku");
					Mb.TampilData();

				break;
			case 3: Mb.hapusBukuSeluruh();
					System.out.println("data telah dihapus");
		
				break;
			case 0 : System.out.println("KElUAR");
					 
			    break;
			default: System.out.println("Pilihan yg anda masukan salah silahkan ulangi"); 
				break;
			}
			
		}while(pilihan!=0);
	}

}
