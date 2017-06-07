package PackageHemat;

/*
 * NIM   : 10115088
 * Nama  : Fajar Abdi Nugraha
 * Kelas : ProLan - 12
 */

public class Soal02<T> {
	
	private T attribut;

	public T getAttribut() {
		return attribut;
	}

	public void setAttribut(T attribut) {
		this.attribut = attribut;
	}
	
	public <B> void printPrim(B isi) {  // Methode ini untuk nge-print tipe data primitif
		System.out.println(isi);
	}
	
	public <B> void printArr(B[] isi) { // Methode ini untuk nge-print tipe array
		for(Object i:isi) {
			System.out.println(i);
		}
	}
	
}
