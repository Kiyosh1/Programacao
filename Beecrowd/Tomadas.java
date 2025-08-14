import java.util.Scanner;

public class Tomadas{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for(int i=0;i<3;i++){
            soma += sc.nextInt();
            soma --;
        }
            soma += sc.nextInt();
        System.out.println(soma);
    }
}
