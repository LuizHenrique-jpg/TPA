package exerciciosRepeticao;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
	
				double altura, pesoIdeal = 0;
				String sexo, resp;
	do {			
			System.out.println("Digite F se o sexo for feminino ou M se for masculino:");
				sexo = ler.next();
			System.out.println("Digite sua altura:");
				altura = ler.nextDouble();
	
		if(sexo.equalsIgnoreCase("F") ) {
			
				pesoIdeal = 52 + (67 * (altura - 1.524));
}									//se for ler em centimetros devo usar 0.67, 0.75 e 152.4
		else {
			
				pesoIdeal = 52 + (75 * (altura - 1.524));
}
			System.out.printf("O seu peso ideal seria: %.1f Kg.%n", pesoIdeal);
			System.out.println("Digite S para continuar ou N para sair:");
				resp = ler.next();
}
	while(resp.equalsIgnoreCase("S") );			
	
	ler.close();
}
}
