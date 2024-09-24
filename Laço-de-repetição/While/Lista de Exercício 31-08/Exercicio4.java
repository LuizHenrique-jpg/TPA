package exerciciosWhile;
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
	int i = 0, anoAtual, anoNasci;	
	
	while(i<6) {
		
		System.out.println("Digite o ano em que nasceu:");
			anoNasci = ler.nextInt();
		System.out.println("Digite o ano atual:");
			anoAtual = ler.nextInt();
			
	int idade = anoAtual - anoNasci;
		
	if(idade<18) 
	{
		System.out.println("Menor de idade.");
	}else{
		System.out.println("Maior de idade.");
	}
		i = i + 1;
	}
	ler.close();
  }
}
