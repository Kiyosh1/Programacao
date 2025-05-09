public class TestaCarrinho{
    public static void main(String args[]){
        Carrinho c1 = new Carrinho(1 , "Computador");
        c1.mostrarCarrinho();
        c1.adcionarQtd(30);
        c1.mostrarCarrinho();
        c1.removerQtd(13);
        c1.mostrarCarrinho();
    }
}


