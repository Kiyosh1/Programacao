import java.util.Scanner;

public class VoltaFaculdadeFisica {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNextInt()) {
            int v = scanner.nextInt();
            int t = scanner.nextInt();
            
            int d = 2 * v * t;

        System.out.println(d);
        }
        scanner.close();
    }
}
