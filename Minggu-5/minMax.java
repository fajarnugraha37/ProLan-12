/*
 * NIM  : 10115088
 * Nama : Fajar Abdi Nugraha
*/
import java.util.Scanner;

public class minMax {

	void pilihanA(int jumData, int[] data) { // Method mencari nilai minimum
		int i, min, jumMin;
		
		min    = data[1];
		jumMin = 0;
		for(i=2; i<=jumData; i++) {
			if (min>=data[i]) {
				min = data[i];
		   }
		}
		for(i=1; i<=jumData; i++) {
			if (min==data[i]) {
				jumMin += 1;
		   }
		}
		System.out.println("\nNilai  Minimum                  : " + min);
		System.out.println("Jumlah kemunculan nilai Minimum : " + jumMin);
	}
	
	void pilihanB(int jumData, int[] data) { // Method mencari nilai minimum
		int i, max, jumMax;
		
		max    = data[1];
		jumMax = 0;
		for(i=2; i<=jumData; i++) {
			if (max<=data[i]) {
				max = data[i];
		   }
		}
		for(i=1; i<=jumData; i++) {
			if (max==data[i]) {
				jumMax += 1;
		   }
		}
		System.out.println("\nNilai  Maximum                  : " + max);
		System.out.println("Jumlah kemunculan nilai Maximum : " + jumMax);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		minMax	find  = new minMax();
		int[] data = new int[100];
		int  jumData, i;
		char pilihan;
		
		// Validasi agar jumData tidak minus ATAU pilihan bukan A/B
		do {
			System.out.print("\n\nMasukkan jumlah data yang akan diinputkan              : ");
			jumData = input.nextInt();
			System.out.print("Piliha A untuk nilia minimum dan B untuk maximum [A/B] : ");
			pilihan = input.next().charAt(0);
		} while((jumData<0) || (pilihan != 'A' && pilihan !='B'));
		
		for(i=1; i<=jumData; i++) {
		  System.out.print("Masukkan angka yang ingin dicari : ");
		  data[i] = input.nextInt();
		}
		
		switch (pilihan) {
			case 'A' : find.pilihanA(jumData, data);
					   break;
			case 'B' : find.pilihanB(jumData, data);
					   break;
		}
		
	}
	
}