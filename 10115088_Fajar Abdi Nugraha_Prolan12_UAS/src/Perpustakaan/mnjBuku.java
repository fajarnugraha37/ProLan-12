package Perpustakaan;

/*
 * NIM	 : 10115088
 * Nama  : Fajar Abdi Nugraha
 * Kelas : ProLan - 12
 * UAS Praktik
 */

import java.util.ArrayList;
import Buku.dataBuku;

public class mnjBuku<T, N> {
	
	ArrayList<dataBuku<T, N>> tampung;
	
	public mnjBuku() {
		tampung = new ArrayList<>();
	}
	
	public void isiData(N noBuku, T jdlBuku, N jmlBuku) {
		tampung.add(new dataBuku<T, N>(noBuku, jdlBuku, jmlBuku));
	}
	
	public void tampilData() {
		System.out.println("No     Judul         Jumlah");
		for(dataBuku<T, N> db:tampung) {
			System.out.println(db.getNoBuku()+"     "+db.getJdlBuku()+"          "+db.getJmlBuku());
		}
	}
	
	public boolean cekData(){
        boolean hasil = false;
        if (tampung.isEmpty()){
            hasil = true;
        }
        return hasil;
    }
	
	public void hapusSeluruh() {
		tampung.removeAll(tampung);
	}

	public boolean hapusSatu(N target) {	
		boolean hapus = false;
		int x = 0;
		for(dataBuku<T, N> db:tampung) {
			if(db.getNoBuku() == target) {
				if(tampung.size()==1) {
					tampung.removeAll(tampung);
				}else{
					tampung.remove(x);
				}
				hapus=true;
				break;
			}else{
				x++;
			}
		}
		return hapus;
	}
	
	public int jmlBuku() {
		return tampung.size();
	}

}
