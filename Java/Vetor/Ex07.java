import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int i, count=0 , N;

        for(i=0; i<5; i++){
            N = sc.nextInt();
            while(N % 5 != 0){
                count += 1;
                System.out.println("Valor invalido ");
                N = sc.nextInt();
            }
            vet[i] = N;
        }

        for(i=0; i<5; i++){
            System.out.print(vet[i] + " | ");
        }
        System.out.println();
        System.out.println("Tentativas = " + count);
    }
}
