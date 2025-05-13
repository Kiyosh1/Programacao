import java.util.Scanner;
public class TesteCliente{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Clientes cliente = new Clientes();
        Clientes cliente1 = new Clientes(432, "Rafael", "Rua Sao Bento", "1234-5678");

        System.out.print("Codigo do cliente: ");
        int cod = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Enderoco do cliente: ");
        String end = sc.nextLine();

        System.out.print("Telefone do cliente: ");
        String tel = sc.nextLine();
        
        cliente.setCodCliente(cod);
        cliente.setNomeCliente(nome);
        cliente.setEndCliente(end);
        cliente.setTelCliente(tel);
        cliente.Status();

        Clientes cliente2 = new Clientes(cliente);

        cliente1.Status();    
        cliente2.Status();
    }
}
