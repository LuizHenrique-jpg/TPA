import java.util.Scanner;

public class comparacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int TAM = 10;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM];
        
        System.out.println("Digite os 10 elementos do vetor A:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Elemento " + (i + 1) + " de A: ");
            A[i] = ler.nextInt();
        }
        
        System.out.println("\nDigite os 10 elementos do vetor B:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Elemento " + (i + 1) + " de B: ");
            B[i] = ler.nextInt();
        }
        
        for (int i = 0; i < TAM; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
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

        System.out.println("\n\nVetor C:");
        for (int i = 0; i < TAM; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(C[i]);
        }
        ler.close();
    }
}