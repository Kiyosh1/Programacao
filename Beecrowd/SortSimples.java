import java.util.Scanner;

public class SortSimples{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int[] vet = {a,b,c};
        int[] vet1 = {a,b,c};
        

        java.util.Arrays.sort(vet1);
        
        for(int i=0;i<3;i++){
            System.out.println(vet1[i]);
        }
        System.out.println();
        for(int i=0;i<3;i++){
            System.out.println(vet[i]);
        }
        
    }
}
