package tpaProjectApostila;
import java.util.Scanner;
public class Exercicio3{
public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	
				double peso, altura, imc;
	
			System.out.println("Digite a peso:");
				peso = ler.nextDouble();
			System.out.println("Digite a altura:");
				altura = ler.nextDouble();
		
				imc = (peso/(altura*2));
		
		if(imc <18.5){
			System.out.println("Excesso de magreza.");
		}else if(imc >=18.5 && imc <25) 
			{System.out.println("Peso normal.");
		}else if(imc <30){
			System.out.println("Execesso de peso.");
        }else if(imc <35){
        	System.out.println("Obesidade (grau 1).");
    	}else if(imc <40){
        	System.out.println("Obesidade (grau 2).");
    	}else{
        	System.out.println("Obesidade (grau 3).");}
	
	
ler.close();}}
