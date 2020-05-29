import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hIni, hFin, duracao;
		hIni = sc.nextInt();
		hFin = sc.nextInt();
		duracao = hFin - hIni;
		if (duracao < 0) {
			duracao += 24;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else 
			if (duracao > 0){
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else 
			System.out.println("O JOGO DUROU 24 HORA(S)");
	sc.close();
	}
}