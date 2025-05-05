import java.util.Scanner;

public class ContaEspaco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, count = 0;

        String str = sc.nextLine();

        for(i=0;i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count += 1;
            }
        }

        System.out.println(count);

    }
}
