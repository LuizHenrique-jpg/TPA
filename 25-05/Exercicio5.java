package tpaProjectApostila;
import java.util.Scanner;
public class Exercicio5 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
				double a, b, c;
		
		System.out.println("Digite o lado A do triângulo:");
				a = ler.nextDouble();
		System.out.println("Digite o lado B do triângulo:");
				b = ler.nextDouble();
		System.out.println("Digite o lado C do triângulo:");
				c = ler.nextDouble();
	
	if(a+b <c || a+c <b || b+c <a){
		System.out.println("Não é um triângulo.");
	
	}else if(a == b && b == c){
		System.out.println("É um triângulo equilátero.");
	
	}else if(a != b && b!=c && c!=a){
		System.out.println("É um triângulo escaleno.");
	
	}else{
		System.out.println("É um triângulo isóceles.");}
	
	
ler.close();}}
