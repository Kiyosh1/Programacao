import java.util.Scanner;

public class Ex03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,count=0;
        String str = sc.nextLine();

        for(i=0; i<str.length();i++){
            if(str.charAt(i) == 'a'){
                count+=1;
                } 
            }
        System.out.println(str.replace('a', '*')); 
        System.out.println(count);

        
    }
}
