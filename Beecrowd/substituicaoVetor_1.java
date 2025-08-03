import java.util.Scanner;

public class substituicaoVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];

        for(int i=0; i<10; i++){
            vet[i] = sc.nextInt();
        }
        for(int i=0; i<10; i++){
            if(vet[i] <= 0)
                vet[i] = 1;
        }
        for(int i=0; i<10; i++){
            System.out.printf("X[%d] = %d%n",i, vet[i]);
        }

        
        sc.close();
    }
}
