import java.util.Scanner;

public class anonnavai{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            int soma = b1+b2;

            if(b1 > b2 && soma > 40){
                System.out.println("DOROTH DECIDE E A NONNA VAI");
            }
            else if(b1 < b2 && soma > 40){
                System.out.println("DAGMAR DECIDE E A NONNA VAI");
            }
            else if(b1 > b2){
                System.out.println("DOROTH DECIDE");
            }
            else{
                System.out.println("DAGMAR DECIDE");
            }
        }
    }
}
