package tpaProjectApostila;
import java.util.Scanner;
public class Exercicio7{
public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	
				String user1,user2,user3,user4,user5;
				int id1, id2, id3, id4, id5;

			System.out.println("Digite o nome do primeiro usuário:");
		        user1 = ler.nextLine();
	        System.out.println("Digite a idade do primeiro usuário:");
		        id1 = ler.nextInt();
		        	ler.nextLine(); //evitar erro

	        System.out.println("Digite o nome do segundo usuário:");
	        	user2 = ler.nextLine();
	        System.out.println("Digite a idade do segundo usuário:");
	        	id2 = ler.nextInt();
	        		ler.nextLine(); 

	        System.out.println("Digite o nome do terceiro usuário:");
	        	user3 = ler.nextLine();
	        System.out.println("Digite a idade do terceiro usuário:");
	        	id3 = ler.nextInt();
	        		ler.nextLine();

	        System.out.println("Digite o nome do quarto usuário:");
	        	user4 = ler.nextLine();
	        System.out.println("Digite a idade do quarto usuário:");
	        	id4 = ler.nextInt();
	        		ler.nextLine(); 

	        System.out.println("Digite o nome do quinto usuário:");
	        	user5 = ler.nextLine();
	        System.out.println("Digite a idade do quinto usuário:");
	        	id5 = ler.nextInt();
	        		ler.nextLine();
		
		if (id1 > id2 && id1 > id3 && id1 > id4 && id1 > id5 && id2 < id3 && id2 < id4 && id2 < id5) 
			{System.out.println(user1+","+ id1+" anos e " +user2+" " +id2+" anos.");}
		
		else if (id2 > id1 && id2 > id3 && id2 > id4 && id2 > id5 && id1 < id3 && id1 < id4 && id1 < id5) 
			{System.out.println(user2+" "+ id2+" anos e " +user1+" " +id1+" anos.");}
		
		else if (id1 > id2 && id1 > id3 && id1 > id4 && id1 > id5 && id3 < id2 && id3 < id4 && id3 < id5) 
			{System.out.println(user1+" "+ id1+" anos e " +user3+" " +id3+" anos.");}
		
		else if (id1 > id2 && id1 > id3 && id1 > id4 && id1 > id5 && id4 < id3 && id4 < id2 && id4 < id5) 
			{System.out.println(user1+" "+ id1+" anos e " +user4+" " +id4+" anos.");}
		
		else if (id1 > id2 && id1 > id3 && id1 > id4 && id1 > id5 && id5 < id3 && id5 < id2 && id5 < id4) 
			{System.out.println(user1+" "+ id1+" anos e " +user5+" " +id5+" anos.");}
		
		else if (id2 > id1 && id2 > id3 && id2 > id4 && id2 > id5 && id3 < id1 && id3 < id4 && id3 < id5) 
			{System.out.println(user2+" "+ id2+" anos e " +user3+" " +id3+" anos.");}
		
		else if(id2 > id1 && id2 > id3 && id2 > id4 && id2 > id5 && id4 < id3 && id4 < id2 && id4 < id5) 
			{System.out.println(user2+" "+ id2+" anos e " +user4+" " +id4+" anos.");}													  
		
		else if(id2 > id1 && id2 > id3 && id2 > id4 && id2 > id5 && id5 < id3 && id5 < id4 && id5 < id1) 
			{System.out.println(user2+" "+ id2+" anos e " +user5+" " +id5+" anos.");}
		
		else if(id3 > id2 && id3 > id1 && id3 > id4 && id3 > id5 && id1 < id2 && id1 < id4 && id1 < id5) 
			{System.out.println(user3+" "+ id3+" anos e " +user1+" " +id1+" anos.");}
		 
		else if(id3 > id2 && id3 > id1 && id3 > id4 && id3 > id5 && id2< id1 && id2 < id4 && id2 < id5) 
			{System.out.println(user3+" "+ id3+" anos e " +user2+" " +id2+" anos.");}
		
		else if(id3 > id2 && id3 > id1 && id3 > id4 && id3 > id5 && id4 < id2 && id4 < id1 && id4 < id5) 
			{System.out.println(user3+" "+ id3+" anos e " +user4+" " +id4+" anos.");}
		
		else if(id3 > id2 && id3 > id1 && id3 > id4 && id3 > id5 && id5 < id2 && id5 < id4 && id5 < id1) 
			{System.out.println(user3+" "+ id3+" anos e " +user5+" " +id5+" anos.");}
		
		else if(id4 > id2 && id4 > id3 && id4 > id1 && id4 > id5 && id1 < id2 && id1 < id3 && id1 < id5) 
			{System.out.println(user4+" "+ id4+" anos e " +user1+" " +id1+" anos.");}
		
		else if(id4 > id2 && id4 > id3 && id4 > id1 && id4 > id5 && id2 < id1 && id2 < id3 && id2 < id5) 
			{System.out.println(user4+" "+ id4+" anos e " +user2+" " +id2+" anos.");}
		
		else if(id4 > id2 && id4 > id3 && id4 > id1 && id4 > id5 && id3 < id2 && id3 < id1 && id3 < id5) 
			{System.out.println(user4+" "+ id4+" anos e " +user3+" " +id3+" anos.");}
		
		else if(id4 > id2 && id4 > id3 && id4 > id1 && id4 > id5 && id5 < id2 && id5 < id3 && id5 < id1) 
			{System.out.println(user4+" "+ id4+" anos e " +user5+" " +id5+" anos.");}
		
		else if(id5 > id2 && id5 > id3 && id5 > id4 && id5 > id1 && id1 < id2 && id1 < id3 && id1 < id4) 
			{System.out.println(user5+" "+ id5+" anos e " +user1+" " +id1+" anos.");}
		
		else if(id5 > id2 && id5 > id3 && id5 > id4 && id5 > id1 && id2 < id1 && id2 < id3 && id2 < id4) 
			{System.out.println(user5+" "+ id5+" anos e " +user2+" " +id2+" anos.");}
		
		else if(id5 > id2 && id5 > id3 && id5 > id4 && id5 > id1 && id3 < id2 && id3 < id2 && id3 < id4) 
			{System.out.println(user5+" "+ id5+" anos e " +user3+" " +id3+" anos.");}
		
		else if(id5 > id2 && id5 > id3 && id5 > id4 && id5 > id1 && id4 < id2 && id4 < id3 && id4 < id5) 
			{System.out.println(user5+" "+ id5+" anos e " +user4+" " +id4+" anos.");}
		
ler.close();
}}
