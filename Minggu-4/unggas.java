public class unggas{
	public String nama_unggas;
	
	public unggas(){
		this("Elang");
		this.nama_unggas="Elang Botak";
		System.out.println(this.nama_unggas);
	}
	public unggas(String nama_unggas){
		this.nama_unggas = nama_unggas;
		System.out.println(this.nama_unggas);
	}
}