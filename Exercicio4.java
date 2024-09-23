package exercicioFor;
import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
				int anoAtual, anoNasc, idadeMais = 0, idadeMenos = 0, userMenos = 0, userMais = 0, idade, numUser=1;
		
			System.out.println("Digite ano atual: ");			
				anoAtual = ler.nextInt();
			
	for(int i=1; i<11; i++) {
		
			System.out.println("Digite ano de nascimento: ");
				anoNasc = ler.nextInt();
		
				idade = anoAtual - anoNasc;
				
		if(idade>idadeMais) {
					idadeMais = idade;
					userMais = i;
				}
		if(idade<idadeMenos) {
					idadeMenos = idade;
					userMenos = i;
				}
			System.out.println("Usuário "+numUser+" idade: "+idade);
			 	numUser++;
			 	
		}
			System.out.println("O mais velho é o usuário " +userMais+" com: "+idadeMais+" anos.");
			
			System.out.println("O mais novo é o usuário " +userMenos+" com: "+idadeMenos+" anos.");
			
	ler.close();
	}
}