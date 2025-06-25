import java.util.Scanner;
public class menorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int[] vet = new int[N];
        int posicao = 0;

        for(int i=0; i<N; i++){
            vet[i] = sc.nextInt();
        }

        int menor = vet[0];

        for(int i=0; i<N; i++){
            if(vet[i] < menor){
                menor = vet[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);

        sc.close();

    }
}
