package exercicios0209;
import java.util.Scanner;
public class ExercicioC { 
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int f, n, i;
		
		System.out.println("Digite o número que se deseja saber o fatorial:");
			n = ler.nextInt();
			
			f = n;
			
			i = n - 1 ;
	
		while(i > 1){
		
		n = n*i;	
			
		i--;

} 
		System.out.println(f + "! tem como resultado: "+ n );
		

		ler.close();
	
		}}
