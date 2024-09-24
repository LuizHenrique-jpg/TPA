package exercicioTpa;
import java.util.Scanner;
public class ExercicioCantina {
	public static void main(String[] args) {
		
		Scanner	ler = new Scanner(System.in);
		
		int prod;
		
		System.out.println("digite o código do produto:");
			prod = ler.nextInt();
			
		switch(prod){
		
		case 1:
			System.out.println("Cachorro-quente: R$ 8,00.");
			break;
		case 2:
			System.out.println("Cheeseburguer: R$ 12,00.");
			break;
		case 3:
			System.out.println("X-Salada: R$ 15,00.");
			break;
		case 4:
			System.out.println("Misto Quente: R$ 11,00.");
			break;	
		case 5:
			System.out.println("Pão na chapa: R$ 6,00.");
			break;	
		default:	
			System.out.println("Esse produto não existe.");
			break;
			
	}
	ler.close();
		}}