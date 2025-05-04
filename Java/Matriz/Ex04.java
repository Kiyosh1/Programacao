import java.util.Scanner;

public class Ex04{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        int [][] A = new int[5][5];
        System.out.println("Digite os valores para uma matriz 5x5");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal principal");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(i == j)
                System.out.print(A[i][j] + " | ");
            }
        }
        System.out.println();
        System.out.println("Diagonal secundaria");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(i + j == 4)
                System.out.print(A[i][j] + " | ");
            }
        }
        System.out.println();
    }
}
