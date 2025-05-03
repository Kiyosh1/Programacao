import java.util.Scanner;

public class Ex04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, soma = 0;
        int[] vet = new int[100];

        for(i=0; i<100; i++){
            vet[i] = sc.nextInt();
        }

        for(i=0; i<100; i++){
            if(i%2 != 0){
                soma += vet[i];
            }
        }

        System.out.println(soma);
    }
}
