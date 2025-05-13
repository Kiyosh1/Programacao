public class Clientes{
    private int codCliente;
    private String nomeCliente;
    private String endeCliente;
    private String telCliente;

    public Clientes(){
        
    }
    public Clientes(int codCliente, String nomeCliente, String endeCliente, String telCliente){
        this.codCliente = codCliente;
        this.nomeCliente = nomeCliente;
        this.endeCliente = endeCliente;
        this.telCliente = telCliente;
    }

    public Clientes(Clientes c){
        this.codCliente = c.codCliente;
        this.nomeCliente = c.nomeCliente;
        this.endeCliente = c.endeCliente;
        this.telCliente = c.telCliente;
    }

    public int getCodCliente(){
        return this.codCliente;
    }
    public void setCodCliente(int codCliente){
        this.codCliente = codCliente;
    }
     public String getNomeCliente(){
        return this.nomeCliente;
    }
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
     public String getEndCliente(){
        return this.endeCliente;
    }
    public void setEndCliente(String endeCliente){
        this.endeCliente = endeCliente;
    }
     public String getTelCliente(){
        return this.telCliente;
    }
    public void setTelCliente(String telCliente){
        this.telCliente = telCliente;
    }
    
    public void Status(){
        System.out.println();
        System.out.println("Codigo do cliente = "+ this.codCliente);
        System.out.println("Nome = "+ this.nomeCliente);
        System.out.println("Endereco = "+ this.endeCliente);
        System.out.println("Telefone = "+ this.telCliente);
        System.out.println();
    }




}
