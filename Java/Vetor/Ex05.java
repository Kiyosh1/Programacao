import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] vet = new int[50];

        for(i=0; i<50; i++){
            vet[i] = sc.nextInt();
        }
        
        for(i=0; i<50; i++){
            if(vet[i]>=0){
                System.out.print(vet[i] + " | ");
            }
        }
    }
}
