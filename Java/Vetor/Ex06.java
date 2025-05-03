import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int i,j,aux;

        for(i=0; i<5; i++){
            A[i] = sc.nextInt();
        }
        for(i=0; i<5; i++){
            B[i] = sc.nextInt();
        }
        j = 4;
        for(i=0; i<5; i++){
            aux = A[i];
            A[i] = B[j];
            B[j] = aux;
            j--;
        }
        for(i=0;i<5;i++){
            System.out.print(A[i] + " | ");
        }
        System.out.println();
        for(i=0;i<5;i++){
            System.out.print(B[i] + " | ");
        }
    }

}
