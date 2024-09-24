package exercicioTpa;
import java.util.Scanner;
public class ExercicioSala {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int sala, mb, b , r , i ;
		double calcMb, calcB, calcR, calcI;
	
		System.out.println("Digite o número de alunos que tiraram MB:");
		mb = ler.nextInt();
	System.out.println("Digite o número de alunos que tiraram B:");
		b = ler.nextInt();
	System.out.println("Digite o número de alunos que tiraram R:");
		r = ler.nextInt();
	System.out.println("Digite o número de alunos que tiraram I:");
		i = ler.nextInt();
	
		sala = ( mb + b + r + i);
	
		calcMb =((double) mb/sala) 	* 100;
		calcB = ((double) b/sala)   * 100;
		calcR = ((double) r/sala)   * 100;
		calcI = ((double) i/sala)   * 100;
	
	System.out.println("Na sala com "+sala+" alunos:");
	System.out.printf("%.1f%%  tiraram MB.\n",calcMb ); 
	System.out.printf("%.1f%%  tiraram B.\n",calcB );
	System.out.printf("%.1f%%  tiraram R.\n",calcR );
	System.out.printf("%.1f%%  tiraram I.\n",calcI );
	
ler.close();
}}