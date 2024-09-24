package exercicios0209;
import java.util.Scanner;
public class ExercicioE {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		    int i, a = 0, b = 1, c, n = 1;
		
		System.out.println("Digite até qual termo a sequência de Fibonacci irá:");
			i = ler.nextInt();
		
		while(i >0) {

		System.out.println(n+"° termo: "+ b);
		                                   
		c = a + b  ; 
		a = b     ; 
		b = c     ; 
		
		n++;
		i--;
	} ler.close();
	}
}
