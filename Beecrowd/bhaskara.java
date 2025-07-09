import java.io.IOException;
import java.util.Scanner;
 
public class bhaskara{
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        delta = Math.pow(b, 2.0)  - 4 * a * c;
        
        x1 = (-b + (Math.sqrt(delta))) / (2.0 * a);
        x2 = (-b - (Math.sqrt(delta))) / (2.0 * a);
        
        
        if (a == 0 || delta < 0 ){
            System.out.println("Impossivel calcular");
        }
        else{      
            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);

        }
        sc.close();
    }
 
}
