import java.util.Scanner;

public class Ex05{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,soma = 0;
        int [][] A = new int[5][5];

        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                A[i][j] = sc.nextInt(); 
            }        
        }
        System.out.println("valor cuja soma da linha mais coluna eh igual a par ");
    
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
            if((i+j) % 2 == 0){
                    System.out.print(" " + A[i][j]);
                }
            else
                System.out.print("");
            }
            System.out.println();
        }
        sc.close();
    }
}
