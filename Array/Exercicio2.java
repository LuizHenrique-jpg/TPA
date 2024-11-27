package listaVetor;
//tabuada de N
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num[] = new int[5];

		for (int i = 0; i < num.length; i++) {

			System.out.println("Digite o número da " + (i + 1) + "° tabuada:");
			num[i] = ler.nextInt();
		}

		for (int j = 0; j <= (num.length - 1); j++) {

			System.out.println();
			System.out.println((j + 1) + "° Tabuada:");

			for (int k = 1; k <= 10; k++) {

				System.out.println(k + "x" + num[j] + " = " + (num[j] * k));
			}
		}
		ler.close();
	}
}
