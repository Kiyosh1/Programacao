import java.util.Scanner;
public class restoDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        if(x > y){
            int temp = x;
            x = y;
            y = temp;
        }
        for(int i = x+1; i < y; i++){
            if(i % 5 == 2 || i % 5 == 3 )
                System.out.println(i);
        }
        sc.close();
    }
}
