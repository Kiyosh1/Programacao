import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros:");
        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        while (num1 != num2){
            if (num1 > num2){
                System.out.println("DECRESCENTE!");
            }
            else {
                System.out.println("CRESCENTE!");
            }
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }
          
        sc.close();
    }
}
