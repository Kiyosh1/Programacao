import java.util.Scanner;

public class Tacografo {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Total = 0;
        int V,T;

        for(int i=0; i<N; i++){
            V = sc.nextInt();
            T = sc.nextInt();
            Total += V * T;
        }
        System.out.println(Total);
    }
}
