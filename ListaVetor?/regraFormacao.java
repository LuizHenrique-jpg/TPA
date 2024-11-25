import java.util.Scanner;

public class regraFormacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int TAM = 10;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }
        
        for (int i = 0; i < TAM; i++) {
            if (A[i] % 2 == 0) { 
                B[i] = 1;
            } else { 
                B[i] = 0;
            }
        }
        
        System.out.println("\nVetor A:");
        for (int i = 0; i < TAM; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(A[i]);
        }

        System.out.println("\n\nVetor B:");
        for (int i = 0; i < TAM; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(B[i]);
        }
    }
}