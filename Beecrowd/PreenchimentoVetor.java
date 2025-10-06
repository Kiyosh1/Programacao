import java.util.Scanner;
public class PreenchimentoVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] vet = new int[10];

        for(int i=0; i<10; i++){
            vet[i] = N;
            System.out.printf("N[%d] = %d\n",i, vet[i]);
            N *= 2;
        }
        sc.close();
    }
}
