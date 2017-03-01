import java.util.Scanner;

public class InputOutput3{
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		int num1, num2, result;
		System.out.print("Number #1 : ");
		num1 = read.nextInt();
		System.out.print("Number #2 : ");
		num2 = read.nextInt();
		result = num1 + num2;
		System.out.println("Number #1 + Number #2 = " + result);
	}
} 