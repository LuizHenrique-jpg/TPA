package listaVetor;
//verificar num primos 
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int a[] = new int[10], b[] = new int[a.length], resto;

		for (int i = 0; i <= 9; i++) {
			System.out.println("Digite o " + (i + 1) + "° número:");
			a[i] = ler.nextInt();
		}

		for (int j = 0; j < a.length; j++) {
			b[j] = a[j];
		}

		for (int k = 0; k < a.length; k++) {

			resto = 0;

			for (int l = 1; l <= b[k]; l++) {
				if (b[k] % l == 0) {
					resto++;
				}
			}

			if (resto == 2) {
				System.out.println(a[k] + " é primo.");
			} else {
				System.out.println(a[k] + " não é primo.");
			}
		}
		ler.close();
    }
}
