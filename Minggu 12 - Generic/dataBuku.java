package paketHemat;

/*
 * NIM	 : 10115088
 * Nama  : Fajar Abdi Nugraha
 * Kelas : ProLan - 12
 * Tugas : Generic class
 */

public class dataBuku<T> {
	
	private T noBuku, jdlBuku;

	public dataBuku(T noBuku, T jdlBuku){
		this.noBuku  = noBuku;
		this.jdlBuku = jdlBuku;
	}
	
	public T getNoBuku() {
		return noBuku;
	}

	public T getJdlBuku() {
		return jdlBuku;
	}
	
}
