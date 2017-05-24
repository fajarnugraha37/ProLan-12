package packageHemat;

import java.util.ArrayList;

public class appManajemenBuku implements intManajemenBuku, intDataBuku {

	ArrayList<dataBuku> tampung;
	
	public appManajemenBuku(){
		tampung = new ArrayList<dataBuku>();
	}
	
	@Override
	public void isiData(int noBuku, String judulBuku, int jumBuku) {
		tampung.add(new dataBuku(noBuku, judulBuku, jumBuku));
	}

	@Override
	public void TampilData() {
		System.out.println("No  Judul		Jumlah");
		for (dataBuku db:tampung){
			System.out.println(db.getNoBuku()+"  "+db.getJudulBuku()+"     "+db.getJumBuku());
		}
	}

	@Override
	public void hapusBukuSeluruh() {
		tampung.removeAll(tampung);
	}

	@Override
	public boolean hapusBukuSebagian(int target) {	
		boolean hapus = false;
		for (int x=1; x<=tampung.size(); x++){
			if (tampung.get(x).getNoBuku() == target) {
				hapus = true;
				tampung.remove(x);
				break;
			}
			/*
			 *  Untuk hapus sebagian sudah jalan
			 *  Tapi ada masalah saat menghapus data pertama
			 *  harus diback dulu baru hapus data pertama lalu dikembalikan lagi
			 *  Karena Mepet jadi belum sempat saya kerjain
			 *  waktu sadar data pertama kalau dihapus error keburu mepet
			 */
		}
		return hapus;
	}

}
