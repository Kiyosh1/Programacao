import java.util.Scanner;

public class Ex03{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i, maior = 0;
        int[] vet = new int[50];

        for(i=0; i<50; i++){
            vet[i] = sc.nextInt(); 
        }
        for(i=0; i<50; i++){
            if(vet[i]>maior)
                maior = vet[i];
        }

        System.out.println(maior);
    }
}
