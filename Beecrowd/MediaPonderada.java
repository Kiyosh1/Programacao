import java.util.Scanner;

public class MediaPonderada{
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        double num1, num2, num3, media;
        num1 = 1;
        num2 = 1;
        num3 = 1;

        media = 0;
        for (int i=0; i<n; i++){
           num1 = input.nextDouble(); 
           num2 = input.nextDouble(); 
           num3 = input.nextDouble(); 
           media = ((num1 * 2 ) + (num2 * 3) + (num3 * 5)) / 10;
           System.out.printf("%.1f%n", media);
        }
        input.close();
    }
 
}
