import java.util.Scanner;
public class Ex02{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int i,j;
        int [][] A = new int[2][2];
        int [][] B = new int[2][2];
        int [][] C = new int[2][2];

                System.out.println("Digite os valores da matriz A");
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                A[i][j] = sc.nextInt(); 
            }
        }
                System.out.println("Digite os valores da matriz B");
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                B[i][j] = sc.nextInt(); 
            }
        }

        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Matriz obtida a partir da Matriz A + B");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(C[i][j]+" | ");
            }
           System.out.println(); 
        }
        sc.close();
    }
}
