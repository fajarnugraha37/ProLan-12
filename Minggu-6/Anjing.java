/*
   NIM  : 10115088
   Nama : Fajar Abdi Nugraha
*/

public class Anjing extends Mamalia {
	
	public Anjing(String jenisMamalia){
		super(jenisMamalia);
		System.out.println("Haloo saya "+jenisMamalia+"\n");
	}
	@Override
	public void menyusui() {
		super.menyusui();
		System.out.println("Sekali menyusui bisa lebih dari satu ekor sekaligus\n");
	}
	@Override
	public void melahirkan() {
		super.melahirkan();
		System.out.println("Sekali melahirkan bisa beberapa ekor anjing\n");
	}
	@Override
	public void mengendus() {
		super.mengendus();
		System.out.println("Bau yang diendus bisa narkoba atau bom\n");
	}
	@Override
	public void makan() {
		super.makan();
		System.out.println("Makanan utamanya daging tetapi sayur bisa(karnivora tidak sejati)\n");
	}
	
	public static void main(String[] args){
		Anjing dog = new Anjing("golden retriver");
		dog.menyusui();
		dog.melahirkan();
		dog.mengendus();
		dog.makan();
	}
}