package exercicioTpa;
import java.util.Scanner;
public class ExercicioFutebol {
	public static void main(String[] args) {
		Scanner	ler = new Scanner(System.in);
	
	int idd;
	
	System.out.println("digite sua idade:");
		idd = ler.nextInt();
		
	switch(idd){
	
	case 6:
		System.out.println("Você é da categoria Dente de Leite.");
		break;
	case 7:
		System.out.println("Você é da categoria junior.");
		break;
	case 8:
		System.out.println("Você é da categoria junior Max.");
		break;
	case 9:
		System.out.println("Você é da categoria junior Master.");
		break;	
	case 10:
		System.out.println("Você é da categoria Master.");
		break;	
	default:	
		System.out.println("Sua idade não é admitida.");
		break;
		
}
ler.close();
	}}

