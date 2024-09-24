package exerciciosRepeticao;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
				int i = 2;
		
		do {
		
			System.out.println(i);
			
				i = i + 2;
}
		while(i<501);
		ler.close();
}
}