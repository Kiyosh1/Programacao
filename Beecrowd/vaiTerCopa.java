import java.util.Scanner;

public class vaiTerCopa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
           int N = sc.nextInt();

           if(N == 0)
               System.out.println("vai ter copa!");
           else
               System.out.println("vei ter duas copas!");
        }
        sc.close();
    }
}
