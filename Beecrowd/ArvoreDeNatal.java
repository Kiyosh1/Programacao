import java.util.Scanner;

public class ArvoreDeNatal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h, d, g;

        
        for(int i=0; i<n; i++){
            h = sc.nextInt();
            d = sc.nextInt();
            g = sc.nextInt();

            if(h <= 200 || h > 300){
                System.out.println("sim");
            }
        }
    }
}
