package Buku;

/*
 * NIM	 : 10115088
 * Nama  : Fajar Abdi Nugraha
 * Kelas : ProLan - 12
 * Tugas : Package
 */

public class dataBuku<T, N> {
	
	private T  jdlBuku;
	private N jmlBuku, noBuku;

	public dataBuku(N noBuku, T jdlBuku, N jmlBuku){
		this.noBuku  = noBuku;
		this.jdlBuku = jdlBuku;
		this.jmlBuku = jmlBuku;
	}
	
	public N getNoBuku() {
		return noBuku;
	}

	public T getJdlBuku() {
		return jdlBuku;
	}
	
	public N getJmlBuku() {
		return jmlBuku;
	}
	
}

