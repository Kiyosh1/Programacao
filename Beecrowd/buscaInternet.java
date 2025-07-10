import java.util.Scanner;

public class buscaInternet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int primeiro = x * 4;

        System.out.println(primeiro);
        sc.close();
    }
}
