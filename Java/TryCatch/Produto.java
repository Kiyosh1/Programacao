public class Produto{
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public void validar(){
       if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome do produto nao pode estar vazio.");
        }else if(preco <=0){
            throw new IllegalArgumentException("Preco invalido! Deve ser maior que zero.");
        }else if(quantidade < 0){
            throw new IllegalArgumentException("Quantidade nao pode ser negativa.");
        } 
    }

}
