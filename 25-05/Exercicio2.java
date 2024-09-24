package tpaProjectApostila;
import java.util.Scanner;
public class Exercicio2 {
public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
					double km, litro, gasto;
	
			System.out.println("Digite a distância percorrida em km:");
				
					km = ler.nextDouble();
			
			System.out.println("Digite a capacidade do seu tanque de combustível em litros:");
				
					litro = ler.nextDouble();
			
					gasto = km/litro;
			
		if(gasto >= 10){
			System.out.println("O carro é econômico.");
		}else{
			System.out.println("O carro não é econômico.");}

ler.close();}}
