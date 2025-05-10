public class TestaPessoa{
    public static void main(String args[]){
        Pessoas p1 = new Pessoas();
        p1.setId (5);
        p1.setNome ("Maria");
        p1.setEndereco ("Rua Sao joao");
        p1.imprimirPessoa();

        Pessoas p2 = new Pessoas(8, "Creusa", "Rua da lapa");
        p2.imprimirPessoa();

        Pessoas p3 = new Pessoas(p2);
        p3.imprimirPessoa();
    } 
}
