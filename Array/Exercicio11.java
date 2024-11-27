import java.util.Scanner;

public class Busca {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] A = new int[10];
        
        System.out.println("escreva os 10 elementos para o vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = ler.nextInt();
        }
        
        for (int j = 0; j < 10; j++) {
            System.out.print("\nescreva o número que quer no vetor: ");
            int X = ler.nextInt();
            
            int encontrado = -1;
            
            for (int i = 0; i < 10; i++) {
                if (A[i] == X) {
                    encontrado = i;
                    break;
                    
                }
            }
            
            if (encontrado != -1) {
                System.out.println("O número " + X + " está presente no vetor na posição " + encontrado + ".");
            } else {
                System.out.println("O número " + X + " não existe no vetor.");
            }
        }

        ler.close();
    }
}
