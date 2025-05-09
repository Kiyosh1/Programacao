public class Carrinho{
    private int id;
    private String nome;
    private int qtd = 0;

    public Carrinho(){
    }

    public Carrinho(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;    
    }

    public int getQtd(){
        return this.qtd;
    }
    
    public void setQtd(int qtd){
        this.qtd = qtd;
    }

    public void mostrarCarrinho(){
        System.out.println("Quantidade " + this.qtd);
        System.out.println("Nome " + this.nome);
        System.out.println("ID " + this.id);
    }

    public void adcionarQtd(int qtd){
        this.qtd += qtd;
    }

    public void removerQtd(int qtd){
        this.qtd -= qtd;
    }
}
