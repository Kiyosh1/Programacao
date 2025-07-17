import java.util.Scanner;

public class maioPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int posicao = 0;

        for(int i=0; i<10; i++){
            vet[i] = sc.nextInt();
        }

        int maior = vet[0];

        for(int i=0; i<10; i++){
            if(vet[i] > maior){
                maior = vet[i];
                posicao = i+1;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }
}
