package exercicios0209;
import java.util.Scanner;
public class ExercicioF {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
			int n, div, resto;
		
		System.out.println("Digite o número que deseja-se saber se é primo:");
			n = ler.nextInt();
			div = n;
	while(div>0) {

	     if(n%div == 0){
			resto = resto + 1;
}
				div--;
}
		
	     if(resto==2) {
		
		System.out.println("O número "+n+" é primo.");
		
}
	     else {
		System.out.println("O número "+n+" não é primo.");
}
ler.close();
}
}
