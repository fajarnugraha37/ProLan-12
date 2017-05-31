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
		
		mnjBuku<String, Integer>	objBuku = new mnjBuku<>();
		read = new Scanner(System.in);
		String  jdlBuku;
		int		noBuku, jmlBuku, target,  pilihan;
		
		do {
			System.out.println("\n\nSelamat datang di aplikasi Manajemen Buku");
			System.out.println("=========================================\n");
			System.out.println("Menu Pilihan");
			System.out.println("1. Isi Data buku");
			System.out.println("2. Tampil Data Buku");
            System.out.println("3. Hapus Seluruh Buku");
            System.out.println("4. Hapus Salah satu Buku");
			System.out.println("5. KELUAR");
			
            if(objBuku.cekData()){
            	System.out.println("\nPERHATIAN DATA KOSONG SILAHKAN ISI DAHULU\n");
            }else{
            	System.out.println("\nJumlah Data Buku tersimpan : "+objBuku.jmlBuku()+"\n");
            }
            
			System.out.print("    pilihan anda : ");
			pilihan = read.nextInt();
		
			switch (pilihan) {
				case 1: System.out.print("Masukan no buku     : ");
						noBuku    = read.nextInt();
						System.out.print("Masukan judul buku  : ");
						jdlBuku = read.next();
                        System.out.print("Masukan jumlah buku : ");
                        jmlBuku = read.nextInt();
                        objBuku.isiData(noBuku, jdlBuku, jmlBuku);
                        System.out.println("data telah diinput");
					
                        break;
				case 2: System.out.println("Data Buku");
						objBuku.tampilData();

						break;
				case 3: objBuku.hapusSeluruh();
                        System.out.println("Seluruh Data Buku telah dihapus");

                        break;
                case 4: System.out.print("Masukan no Buku yang ingin dihapus : ");
                        target = read.nextInt();
                        if(objBuku.hapusSatu(target)){
                        	System.out.println("data telah terhapus");
                        }else{
                            System.out.println("data yang ingin anda hapus tidak ada");
                        }
                                
                        break;
               case 5 : System.out.println("KElUAR");
					 
               			break;
               default: System.out.println("Pilihan yg anda masukan salah silahkan ulangi"); 
						
               			break;
			}
			
		}while(pilihan!=5);
	}

}
