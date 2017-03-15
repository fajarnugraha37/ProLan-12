public class OperatorRelasional {

	public static void main(String[] args) {
	
	byte x = 5;
	byte y = 4;
	System.out.println("Apakah X sama dengan y? " + (x==y));
	System.out.println("Apakah x tidak sama dengan y? " + (x!=y));
	System.out.println("Apakah x lebih besar dari y " + (x>y));
	System.out.println("Apakah x lebih kecil dari " + (x<y));
	System.out.println("Apakah x lebih besar sama dengan y " + (x>=y));
	System.out.println("Apakah X lebih kecil sama dengan y? " + (x<=y));
	
	if (x != y) {
		System.out.println("x tidak sama dengan  y");
	} else {
		System.out.println("x sama dengan  y");
	}
	
	}
	
}