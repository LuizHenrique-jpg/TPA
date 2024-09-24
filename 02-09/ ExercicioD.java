package exercicios0209;
import java.util.Scanner;
public class ExercicioD {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
			
			int n = 0, e = 0, i=0, eI;
		
		System.out.println("Digite o número da base:");
				n = ler.nextInt();
		System.out.println("Digite o número do expoente:");
				i = ler.nextInt();
			
				eI = i;
				e = n;
			
			
	  while(i>1) {
			
				e = e*n       ;
			
				i--;
			
			}
			
		System.out.println("A potência de "+ n + "^" + eI + " é: " +e  );
			
			ler.close();
	}
}
