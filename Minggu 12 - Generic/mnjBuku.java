package paketHemat;

/*
 * NIM	 : 10115088
 * Nama  : Fajar Abdi Nugraha
 * Kelas : ProLan - 12
 * Tugas : Generic class
 */

import java.util.ArrayList;

public class mnjBuku<T> {
	
	ArrayList<dataBuku<T>> tampung;
	
	public mnjBuku() {
		tampung = new ArrayList<>();
	}
	
	public void isiData(T noBuku, T jdlBuku) {
		tampung.add(new dataBuku<T>(noBuku, jdlBuku));
	}
	
	public void tampilData() {
		System.out.println("No          Judul");
		for(dataBuku<T> db:tampung) {
			System.out.println(db.getNoBuku()+"     "+db.getJdlBuku());
		}
	}

}
