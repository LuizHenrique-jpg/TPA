package listaVetor;

public class Exercicio6 {
	public static void main(String[] args) {

		int a[] = new int[11];
		
		
		for(int i = 0; i < 11; i++) { 
			
			a[i] = 1; 
		
			for(int j = 0; j < i; j++) { 
			
				a[i] = a[i] * 2;  
			} 
		}
		
		a[0] = -1; 

		for(int k = 0; k <=10; k++) {
			
			System.out.println(a[k]);
		}
	}
}
