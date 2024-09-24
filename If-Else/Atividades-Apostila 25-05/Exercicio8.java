package tpaProjectApostila;
import java.util.Scanner;
public class Exercicio8{
public static void main(String[] args){
	Scanner ler = new Scanner(System.in);

			double nota1, nota2,notaExame, media;
	
		System.out.println("Digite a primeira nota:");
			nota1 = ler.nextDouble();
		System.out.println("Digite a segundo nota:");
			nota2 = ler.nextDouble();
			
			media = (nota1+nota2)/2;
				
	if(media<3)
		{System.out.println("Reprovado!");}
	else if(media >= 6)
		{System.out.println("Aprovado!");}
	else if(media >=3 && media <6)
		{System.out.println("Digite a nota de exame:");}
			notaExame = ler.nextDouble();
	if((media+notaExame)>=6)
		{System.out.println("Aprovado!");}
	else 
		{System.out.println("Reprovado!");}
	
	ler.close();}}