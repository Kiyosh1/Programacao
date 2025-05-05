import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;

        nome1 = sc.nextLine();
        nome2 = sc.nextLine();

        System.out.println(nome1);
        System.out.println(nome2);

        char first = nome1.charAt(1);
        System.out.println(first);
        char first1 = nome2.charAt(1);
        System.out.println(first1);
    }
}
