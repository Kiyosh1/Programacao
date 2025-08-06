import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int N = sc.nextInt();
            System.out.println(N-1);
        }
        
        sc.close();
    }
}
