package tpaProjectApostila;
import java.util.Scanner;
public class Exercicio9{
public static void main(String[] args){
	Scanner ler = new Scanner(System.in);	

			double salario,imposto;
	
	System.out.println("Digite o salário:");
			salario = ler.nextDouble();
	
		if(salario <= 1434.59) 
			{imposto = 0;}
		else if(salario <= 2150.00) 
			{imposto = salario * 0.075 - 107.59;}
		else if (salario <= 2866.70) 
			{imposto = salario * 0.15 - 268.84;} 
		else if (salario <= 3582.00) 
			{imposto = salario * 0.225 - 483.84;} 
		else
			{imposto = salario * 0.275 - 662.94;}
	
		System.out.printf("O desconto do IRPF para o salário de R$ %.2f é: R$ %.2f", salario, imposto);

ler.close();}}
