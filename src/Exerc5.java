import java.util.Locale;
import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int produto, quantidade;
		float total;
		produto = sc.nextInt();
		quantidade = sc.nextInt();

		if (produto == 1) {
			total = (float) 4.00 * quantidade;
			System.out.printf("Total: R$ %.2f %n", total);
		} else if (produto == 2) {
			total = (float) 4.50 * quantidade;
			System.out.printf("Total: R$ %.2f %n", total);
		} else if (produto == 3) {
			total = (float) 5.00 * quantidade;
			System.out.printf("Total: R$ %.2f %n", total);
		} else if (produto == 4) {
			total = (float) 2.00 * quantidade;
			System.out.printf("Total: R$ %.2f %n", total);
		} else if (produto == 5) {
			total = (float) 1.50 * quantidade;
			System.out.printf("Total: R$ %.2f %n", total);
		}
		sc.close();
	}

}
