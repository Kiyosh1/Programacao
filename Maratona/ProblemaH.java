import java.util.Scanner;
public class ProblemaH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] numeros = {a, b, c};

        java.util.Arrays.sort(numeros);

        int pivo = numeros[1];
        System.out.println(pivo);
    }
}
