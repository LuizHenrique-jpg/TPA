package listaVetor;
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int a[] = new int[15], b[] = new int[15];
		
			
		for(int i = 0; i<15; i++) {
			
		System.out.println("Digite "+ (i+1) +"° número para saber o fatorial:");
			a[i] = ler.nextInt(); 
				
			b[i] = 1; 
			
			for(int j = a[i]; j > 1; j--) { 
				b[i] = b[i] * j; 
				}
		}
		
		for(int k = 0;k<15;k++) {
		System.out.println(b[k]);
		}
		ler.close();
	}
}
