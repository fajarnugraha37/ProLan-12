class unggasUtamaRevised {
	public static void main(String[] args) {
		unggasRevised Elang = new unggasRevised();
		
		Elang.jenisBurung  = "Elang emas";
		Elang.jenisMakanan = "Daging Hewan / Carnivora";
		Elang.umur		   = 5;
		Elang.berat		   = 20;
		Elang.jenisKelamin = 'L';
		Elang.cacad		   = false;
		
		
		Elang.terbang();
		Elang.makan();
		Elang.berkicau();
		Elang.bertelur();
		Elang.memangsa();
		Elang.mematuk();
		Elang.mencakar();
	}
}