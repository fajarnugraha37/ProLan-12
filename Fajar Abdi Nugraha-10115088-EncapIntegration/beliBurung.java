package EncapIntegrationPackage;

import java.util.Scanner;

/*
 * Tugas : EncapIntegration
 * NIM   : 10115088
 * Nama  : Fajar Abdi Nugraha
 * Kelas : ProLan-12
 */

public class beliBurung {

	public static void main(String[] args) {
		burung oBurung = new burung();
		Scanner read = new Scanner(System.in);
		int pilih;
		
		System.out.println("Aplikasi Beli Burung Online");
		System.out.println("Anda bisa bisa mengecek harga burung secara online");
		System.out.println("Anda bisa cek harga burung dibawah ini : ");
		System.out.println("1. Elang Jawa");
		System.out.println("2. Elang Bondol");
		System.out.println("3. Merpati Putih");
		System.out.print("Pilihan anda : ");
		pilih = read.nextInt();
		
		switch (pilih) {
		case 1  : oBurung.setJenisBurung("Elang");  
				  System.out.println("Jenis Burung  : "+oBurung.getJenisBurung());
				  oBurung.setSpesiesBurung("Elang Jawa");
				  System.out.println("Spesies Brung : "+oBurung.getSpesiesBurung());
				  oBurung.setJenisMakanan("Daging");
				  System.out.println("Jenis Makanan : "+oBurung.getJenisMakanan());
				  oBurung.setJenisKelamin('P');
				  System.out.println("Jenis Kelamin : "+oBurung.getJenisKelamin());
				  oBurung.setHargaBurung(25000000);
				  System.out.println("Harga Burung  : "+oBurung.getHargaBurung());
			
				  break;
		case 2  : oBurung.setJenisBurung("Elang");  
				  System.out.println("Jenis Burung  : "+oBurung.getJenisBurung());
				  oBurung.setSpesiesBurung("Elang Bondol");
				  System.out.println("Spesies Brung : "+oBurung.getSpesiesBurung());
				  oBurung.setJenisMakanan("Daging");
				  System.out.println("Jenis Makanan : "+oBurung.getJenisMakanan());
				  oBurung.setJenisKelamin('L');
				  System.out.println("Jenis Kelamin : "+oBurung.getJenisKelamin());
				  oBurung.setHargaBurung(20000000);
				  System.out.println("Harga Burung  : "+oBurung.getHargaBurung());

				  break;
		case 3  : oBurung.setJenisBurung("Merpati");  
		  		  System.out.println("Jenis Burung  : "+oBurung.getJenisBurung());
		  		  oBurung.setSpesiesBurung("Merpati Putih");
		  		  System.out.println("Spesies Brung : "+oBurung.getSpesiesBurung());
		  		  oBurung.setJenisMakanan("Buah/sayur");
		  		  System.out.println("Jenis Makanan : "+oBurung.getJenisMakanan());
		  		  oBurung.setJenisKelamin('P');
		  		  System.out.println("Jenis Kelamin : "+oBurung.getJenisKelamin());
		  		  oBurung.setHargaBurung(3000000);
		  		  System.out.println("Harga Burung  : "+oBurung.getHargaBurung());
	
			
				  break;
		default : System.out.println("anda salah memasukan pilihan");
		}
	}
	
}
