package exerciciosWhile;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int  n;
		int i = 1;
		System.out.println("Digite o número para ser multiplicado:");
		 n = ler.nextInt();
		
		
		 while(i<11) {
			 
			 System.out.println(i + " x " + n + " = " + (i*n));
		 
			 	i = i + 1;
		 
		 ler.close();
	}
  }
}
