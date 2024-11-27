package listaVetor;
//pares e ímpares
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int a[] = new int[20], b[] = new int[20], par = 0, impar = 0;

		for (int i = 0; i <= 19; i++) {

			System.out.println("Digite o " + (i + 1) + "° número:");
			a[i] = ler.nextInt();

			if (a[i] % 2 == 0) {
				b[par] = a[i];
				par = par + 1;
			} else {
				impar = impar + 1;
			}
		}
		int numPar = par;

		for (int j = 0; j < 20; j++) {

			if (a[j] % 2 != 0) {
				b[numPar] = a[j];
				numPar = numPar + 1;
			}
		}

		for (int k = 0; k < 20; k++) {
			System.out.print(b[k] + "; ");
		}

		ler.close();
	}
}
