import java.util.Scanner;

public class TestaProduto{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
        
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preco do produto: ");
        double preco = sc.nextDouble();
        
        System.out.print("Quantidade do produto: ");
        int quantidade = sc.nextInt();
        
        Produto p1 = new Produto(nome, preco, quantidade);
        p1.validar();
        System.out.println("Produto cadastrado com sucesso!");
        } catch(IllegalArgumentException e){
            System.out.println("Error " + e.getMessage());
        }
        sc.close();
    }
}
