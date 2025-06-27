import java.util.Scanner;

public class entradaSaidaCpf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        System.out.print(N.charAt(0));
        System.out.print(N.charAt(1));
        System.out.println(N.charAt(2));
        
        System.out.print(N.charAt(4));
        System.out.print(N.charAt(5));
        System.out.println(N.charAt(6));
        
        System.out.print(N.charAt(8));
        System.out.print(N.charAt(9));
        System.out.println(N.charAt(10));
        
        System.out.print(N.charAt(12));
        System.out.println(N.charAt(13));
        sc.close();
    }
}
