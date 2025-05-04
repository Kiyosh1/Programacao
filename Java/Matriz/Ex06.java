import java.util.Scanner;
public class Ex06{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int ord = 3;
        int i,j,num, principal = 0, outros = 0;
        int [][] A = new int [ord][ord];
    
        

        System.out.println("Digite o valor 0 ou 1 para a matriz: ");
        for(i=0;i<ord;i++){
            for(j=0;j<ord;j++){
                num = sc.nextInt();
                while(num < 0 || num > 1){
                    System.out.println("Valor invalido digite apenas 0 ou 1");
                    num = sc.nextInt();
                }
                    A[i][j] = num; 
            }
        }        
        for(i=0;i<ord;i++){
            for(j=0;j<ord;j++){
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        for(i=0;i<ord;i++){
            for(j=0;j<ord;j++){
                if(A[i] == A[j]){
                    principal += 1;
                }
                else{
                    outros += A[i][j];
                }
            }
            System.out.println();
        }
        if(principal == 3 && outros == 0){
            System.out.println("É matriz identedade!!");
        }
        else{
            System.out.println("Não é matriz identidade!!");
        }
    }
}
