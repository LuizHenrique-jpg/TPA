import java.util.Scanner;

public class intersecao {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int TAM = 10;
        
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM];
        int posicaoC = 0;
        
        for(int i = 0; i < TAM; i++){
            System.out.println("Digite os 10 valores de A:");
            System.out.print("A[" + i + "]: ");
            A[i] = ler.nextInt();   
        }
            
        for(int j = 0; j < TAM; j++){
            System.out.println("\nDigite os 10 valores de B:");
            System.out.print("B[" + j + "]: ");
            B[j] = ler.nextInt();      
        }
    
        for(int i = 0; i < TAM; i++){
            for(int j = 0; j < TAM; j++){
                if (A[i] == B[j]){
                    int jaExiste = 0;
                    for(int k = 0; k < posicaoC; k++){
                        if (C[k] == A[i]){
                            jaExiste = 1;
                            break;
                        }
                    } 
                    if (jaExiste == 0){
                        C[posicaoC] = A[i];
                        posicaoC++;
                    }
                }
            }  
        }
        
        System.out.println("\nEsta é a interseção:");
        if (posicaoC == 0){
            System.out.println("Não há elementos em comum entre A e B.");
        } else {
            for (int k = 0; k < posicaoC; k++){
                if (k > 0) {
                    System.out.print(", ");
                }
                System.out.print(C[k]);
            }
            System.out.println(); 
        }

        ler.close();
    }
}