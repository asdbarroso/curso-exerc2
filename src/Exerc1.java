import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		
		int num;
		
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("NÃO NEGATIVO");
		} 
		else {
			System.out.println("NEGATIVO");
		}
	}

}
