import java.util.Scanner;

public class Ex02{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int i;
        int[] vet = new int[5];
        int[] vetX3 = new int[5];

        for(i=0; i<5; i++){
            vet[i] = sc.nextInt();
        }
        
        for(i=0; i<5; i++){
            vetX3[i] = vet[i] * 3;
        }

        for(i=0; i<5; i++){
            System.out.print(vetX3[i]+ " | ");
        }
    }
}
