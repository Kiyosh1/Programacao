public class TestePaciente{
    public static void main(String args[]){
        Paciente p = new Paciente("Rafael", 1997, 1.34, 80);
        p.imprimirIdade();
        p.calcularImc();
    }
}
