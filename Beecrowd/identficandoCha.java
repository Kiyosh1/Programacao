import java.util.Scanner;

public class identficandoCha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correto = sc.nextInt();
        int a, b, c, d, e, acertos;
        acertos = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        if(a ==correto)
            acertos +=1;
        if(b ==correto)
            acertos +=1;
        if(c ==correto)
            acertos +=1;
        if(d ==correto)
            acertos +=1;
        if(e ==correto)
            acertos +=1;

        System.out.println(acertos);

        sc.close();
    }
}
