import java.util.Scanner;
public class FibonacciFacil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i, x = 0, y = 1, z=0;
        for( i=0; i<N; i++){
            z = x+y;
            System.out.print(x + " ");
            x = y;
            y = z;

        }
        System.out.println();

    }
}
