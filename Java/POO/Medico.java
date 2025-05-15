public class Medico{
    private int crm;
    private String nome;
    private String especialidade;
    private int experiencia;

    public Medico(){

    }
    public Medico (int crm, String nome, String especialidade, int experiencia){
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
        this.experiencia = experiencia;
    }
    public Medico(Medico m){
        this.crm = m.crm;
        this.nome = m.nome;
        this.especialidade = m.especialidade;
        this.experiencia = m.experiencia;
    }

    public int getCrm(){
        return crm;
    }
    public void setCrm(int crm){
        this.crm = crm;
    }

    public String getNome(){
        return nome;
    } 
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public int getExperiencia(){
        return experiencia;
    }
    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }


    public void imprimirDados(){
        System.out.println();
        System.out.println("Crm do Medico: " + this.crm);
        System.out.println("Nome do Medico: " + this.nome);
        System.out.println("Especialidade do Medico: " + this.especialidade);
        System.out.println("Experiencia do Medico: " + this.experiencia);
        
    }
    public void tempoExperiencia(){
        if(this.experiencia < 3 ){
            System.out.println("Muito pouca Experiencia");
        }else if(this.experiencia < 5){
            System.out.println("Pouca Experiencia");
        }else if(this.experiencia < 10){
            System.out.println("Experiente");
        }else if(this.experiencia < 35){
            System.out.println("Muito Experiente");
        }
    }

    
}
