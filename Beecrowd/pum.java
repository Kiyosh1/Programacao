import java.util.Scanner;

public class pum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();

       for(int i=0; i<N;i++){
           System.out.printf("%d %d %d PUM%n",i*4+1, i*4+2, i*4+3);       
       }


       sc.close();
    }
}
