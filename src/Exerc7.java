import java.util.Locale;
import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float x, y;

		x = sc.nextFloat();
		y = sc.nextFloat();

		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else {
			System.out.println("Q4");
		}
		sc.close();
	}

}