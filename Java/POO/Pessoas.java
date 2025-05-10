public class Pessoas{
    private int id;
    private String nome;
    private String endereco;

    public Pessoas(){
        
    }
    
    public Pessoas(int id, String nome, String endereco){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public Pessoas(Pessoas p){
        this.id = p.id; 
        this.nome = p.nome;
        this.endereco = p.endereco;
    }

    public int getId (){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }
    
     public String getNome (){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
     public String getEndereco (){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
     

    public void imprimirPessoa(){
        System.out.println("ID " + this.id);
        System.out.println("Nome " + this.nome);
        System.out.println("Endereco " + this.endereco);
    }
}
