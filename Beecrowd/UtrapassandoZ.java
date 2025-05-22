import java.util.Scanner;
public class UtrapassandoZ{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, z, count=0;

        x = sc.nextInt();
        z = sc.nextInt();
        int total = x;
        while(x >= z){
            z = sc.nextInt();
        }

        while(total < z){
            total += x+1;
            count ++;
        }
        System.out.println(count);
    }
}
