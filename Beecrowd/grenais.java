import java.util.Scanner;

public class grenais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inter = 0, gremio = 0, partidas = 0, empates =0;
        int n, x = 0, y = 0; 
        do{
            partidas += 1;
            x = sc.nextInt();
            y = sc.nextInt();
            
            if (x > y)
                inter += 1;
            else if (y > x)
                gremio +=1;
            else if(x == y)
                empates += 1;
            
            System.out.println("Novo grenal (1-sim 2-nao)");
        n = sc.nextInt();
        }
        while(n == 1);
        System.out.printf("%d grenais%n", partidas);
        System.out.printf("Inter:%d%n", inter);
        System.out.printf("Gremio:%d%n", gremio);
        System.out.printf("Empates:%d%n", empates);
        if(inter > gremio)
            System.out.println("Inter venceu mais");
        else if(gremio > inter)
            System.out.println("Gremio venceu mais");
        else 
            System.out.println("Nao houve vencedor");
        sc.close();
    }
}
