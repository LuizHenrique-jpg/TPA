package listaVetor;
import java.util.Scanner;
public class Exercicio9 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int igual = 0, a[] = new int[10], b[] = new int[10], c[] = new int[10];

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite " + (i + 1) + "° número de A:");
			a[i] = ler.nextInt();
		}

		for (int j = 0; j < 10; j++) {
			System.out.println("Digite " + (j + 1) + "° número de B:");
			b[j] = ler.nextInt();

			for (int k = 0; k < 10; k++) {

				if (b[j] == a[k]) {
					c[0 + igual] = b[j];
					igual++;
				}
			}
		}

		for (int l = 0; l < 10; l++) {
			if (c[l] > 0) {
				System.out.println(c[l]);
			}
		}

		ler.close();
	}
}
