import java.util.Scanner;

public class ordenacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int TAM = 10;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM];
        
        System.out.println("Digite os 10 números inteiros para A:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = ler.nextInt();
        }
        
        for (int i = 0; i < TAM; i++) {
            B[i] = A[i];
            C[i] = A[i];
        }
        
        for (int i = 0; i < TAM - 1; i++) {
            for (int j = i + 1; j < TAM; j++) {
                if (B[i] > B[j]) {
                    int temp = B[i];
                    B[i] = B[j];
                    B[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < TAM - 1; i++) {
            for (int j = i + 1; j < TAM; j++) {
                if (C[i] < C[j]) {
                    int temp = C[i];
                    C[i] = C[j];
                    C[j] = temp;
                }
            }
        }
        

        //Deus me ajude pra isso dar certo
        
        System.out.println("\nVetor A (Original):");
        for (int i = 0; i < TAM; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(A[i]);
        }
        
        System.out.println("\nVetor B (Ordem Crescente):");
        for (int i = 0; i < TAM; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(B[i]);
        }
        
        System.out.println("\nVetor C (Ordem Decrescente):");
        for (int i = 0; i < TAM; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(C[i]);
        }
        
        ler.close();
    }
}
