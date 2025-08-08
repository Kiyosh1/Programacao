import java.util.Scanner;

public class respostaCerta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];
        for(int i = 0; i < N; i++){
            vet[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            System.out.printf("resposta %d: %d%n",i+1,vet[i]);
        }
        
        sc.close();
    }
}
