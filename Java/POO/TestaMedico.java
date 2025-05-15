import java.util.Scanner;

public class TestaMedico{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Medico m1 = new Medico();

        System.out.print("Crm do Medico: ");
        int crm = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do Medico: ");
        String nome = sc.nextLine();
        
        System.out.print("Especialidade do Medico: ");
        String esp = sc.nextLine();
        
        System.out.print("Experiencia do Medico: ");
        int exp = sc.nextInt();

        while(exp <= 1 || exp > 50){
            System.out.print("Valor invalido, digite outro numero: ");
            exp = sc.nextInt();
        }

        m1.setCrm(crm);
        m1.setNome(nome);
        m1.setEspecialidade(esp);
        m1.setExperiencia(exp);
        m1.imprimirDados();
        m1.tempoExperiencia();

        Medico m2 = new Medico(5431, "Murakami", "Geriatra", 14);
        m2.imprimirDados();
        m2.tempoExperiencia();

        Medico m3 = new Medico(m1);
        m3.imprimirDados();
        m3.tempoExperiencia();
    }
}
