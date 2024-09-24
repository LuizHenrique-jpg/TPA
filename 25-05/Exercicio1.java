package tpaProjectApostila;
import java.util.Scanner;
public class Exercicio1{
public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
	
	int anoNasc, anoAtual, idade;
	
		System.out.println("Digite seu ano de nascimento:");
			anoNasc = ler.nextInt();
			
		System.out.println("Digite o ano atual:");
			anoAtual = ler.nextInt();
			
	idade = (anoAtual - anoNasc );
		
		if(idade <10) 
			{System.out.println("Nessa idade é criança.");}
		else if(idade >= 10 && idade < 18) 
			{System.out.println("Nessa idade é adoslecente.");}
		else if(idade >= 18 && idade <60) 
			{System.out.println("Nessa idade é adulto.");}
		else if(idade>=60 && idade <100) 
			{System.out.println("Nessa idade é idoso.");}
		else 
			{System.out.println("Só o pó!");}
		
ler.close();}}