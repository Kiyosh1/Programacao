import java.util.Scanner;
 
public class Intervalos2 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, x,in, out;
        in = 0;
        out = 0;
        x = input.nextInt();

        for (int i=0; i < x; i++){
            n = input.nextInt();
            if (n >= 10 && n <= 20){
                in += 1;   
            }
            else{
                out += 1;
            }
    }
    System.out.printf("%d in%n", in);
    System.out.printf("%d out%n", out);
    input.close();
    }
 
}
