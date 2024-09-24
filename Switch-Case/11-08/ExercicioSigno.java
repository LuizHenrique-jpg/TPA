package exercicioTpa;
import java.util.Scanner;
public class ExercicioSigno {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int dia, mes;
	
	System.out.println("Digite o número do dia em que nasceu:");
		dia = ler.nextInt();
	System.out.println("Digite o número do mês em que nasceu:");
		mes = ler.nextInt();
	
	switch(mes){
	
			case 1:
				if( dia <= 20 ) {
					System.out.println("Você é Capricórnio");}
				else{ 
					System.out.println("Você é Aquário");}
			break;
			
			case 2:
				if( dia <= 18 ) {
					System.out.println("Você é Aquário");}
				else{ 
					System.out.println("Você é Peixes");}
			break;
			
			case 3:
				if( dia <= 20 ) {
					System.out.println("Você é Peixes.");}
				else{ 
					System.out.println("Você é Áries.");}
			break;
			
			case 4:
				if( dia <= 20 ) {
					System.out.println("Você é Áries.");}
				else{ 
					System.out.println("Você é Touro.");}
			break;		
			
			case 5:
				if( dia <= 20 ) {
					System.out.println("Você é Touro.");}
				else{ 
					System.out.println("Você é Gêmeos.");}
			break;		
			
			case 6:
				if( dia <= 20 ) {
					System.out.println("Você é Gêmeos.");}
				else{ 
					System.out.println("Você é Câncer.");}
			break;
			
			case 7:
				if( dia <= 22 ) {
					System.out.println("Você é Câncer.");}
				else{ 
					System.out.println("Você é Leão.");}
			break;
			
			case 8:
				if( dia <= 22 ) {
					System.out.println("Você é Leão.");}
				else{ 
					System.out.println("Você é Virgem.");}
			break;
			
			case 9:
				if( dia <= 22 ) {
					System.out.println("Você é Virgem.");}
				else{ 
					System.out.println("Você é Libra.");}
			break;
			
			case 10:
				if( dia <= 22 ) {
					System.out.println("Você é Libra.");}
				else{ 
					System.out.println("Você é Escorpião.");}
			break;
			
			case 11:
				if( dia <= 21 ) {
					System.out.println("Você é Escorpião.");}
				else{ 
					System.out.println("Você é Sagitário.");}
			break;
			
			case 12:
				if( dia <= 21 ) {
					System.out.println("Você é Sagitário.");}
				else{ 
					System.out.println("Você é Capricórnio.");}
			break;
					
			default: 
					System.out.println("Não nasceu!");
					
	}ler.close();
}}
