import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int [] vet = new int[5];

        for(i=0;i<5;i++){
                vet[i] = sc.nextInt();
            }
        
        for(i=4;i>=0;i--){
                System.out.print(vet[i]+" | ");
            }
        
    }
}
