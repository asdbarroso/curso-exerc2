import java.util.Locale;
import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, imp1, imp2, imp3;
		salario = sc.nextDouble();
		if (salario <= 2000.0) {
			System.out.println("Isento");
		} else 
			if (salario > 2000.0 && salario <= 3000.0) {
			salario = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %2.f" , salario);
		} else 
			if (salario > 3000.0 && salario <= 4500.0) {
			imp1 = (salario - 3000.00) * 0.18;
			imp2 = 1000.00 * 0.08;
			salario = imp1 + imp2;
			System.out.printf("R$ %.2f", salario);
		} else 
			if (salario > 4500.0) {
			imp1 = (salario - 4500.00) * 0.28;
			imp2 = (4500.00 - 3000.00) * 0.18;
			imp3 = 1000.00 * 0.08;
			salario = imp1 + imp2 + imp3;
			System.out.printf("R$ %.2f", salario);
		}
		sc.close();
	}
}