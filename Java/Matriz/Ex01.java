import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [][] numeros = new int[4][4];
        int i,j,soma = 0;

        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                System.out.println("Digite um valor para a matriz");
                numeros[i][j]= sc.nextInt();
                soma = soma + numeros[i][j];
            }
        }
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                System.out.print(numeros[i][j]+ " | ");
            }
            System.out.println("");
        }
        
        System.out.println("Valor da soma dos elementos da matriz: "+soma);
    }
}
