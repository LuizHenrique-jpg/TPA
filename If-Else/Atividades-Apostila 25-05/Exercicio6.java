package tpaProjectApostila;
import java.util.Scanner;
public class Exercicio6 {
public static void main(String[] args){
  Scanner ler = new Scanner(System.in);

			int a,b,c;
	
	System.out.println("Digite o número A:");
		a = ler.nextInt();
	System.out.println("Digite o número B:");
		b = ler.nextInt();
	System.out.println("Digite o número C:");
		c = ler.nextInt();
	
	if(a<b && b<c){
		System.out.println(a+","+ b+", " +c);}
	else if(b<a && a<c){
		System.out.println(b+","+ a+", " +c);}
	else if(c<b && b<a){
		System.out.println(c+","+ b+", " +a);}
	else if(a<c && c<b){
		System.out.println(a+","+ c+", " +b);}
	else if(b<c && c<a){
		System.out.println(b+","+ c+", " +a);}
	else{	
		System.out.println(c+","+ a+", " +b);}
	
ler.close();}}