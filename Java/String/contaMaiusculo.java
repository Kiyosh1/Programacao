import java.util.Scanner;

public class contaMaiusculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i, count = 0;
        
        for(i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                count += 1;
            } 
        }

        System.out.println(count);
    }
}
