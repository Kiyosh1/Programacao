import java.util.Calendar;
import java.util.Scanner;

public class Paciente{
    private String nome;
    private int anoNasc;
    private double altura;
    private double peso;

    public Paciente(String nome, int anoNasc, double altura, double peso){
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnoNasc(){
        return this.anoNasc;
    }
    public void setAnoNasc(int anoNasc){
        this.anoNasc = anoNasc;
    }

    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public void imprimirIdade(){
        Calendar calend = Calendar.getInstance();
        int ano = calend.get(Calendar.YEAR);
        int idade = ano - anoNasc;
        System.out.println("Idade " + idade);
    }

    public void calcularImc(){
        double imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.printf("IMC = %.2f: Abaixo do Peso\n",imc);
        }else if(imc < 25){
            System.out.printf("IMC = %.2f: Peso Normal\n",imc);
        }else if(imc < 30){
            System.out.printf("IMC = %.2f: Sobrepeso\n",imc);
        }else if(imc < 35){
            System.out.printf("IMC = %.2f: Obesidade grau 1\n",imc);
        }else if(imc < 40){
            System.out.printf("IMC = %.2f: Obesidade grau 2\n",imc);
        }else if(imc > 40){
            System.out.printf("IMC = %.2f: Obesidade grau 3\n",imc);
        }



    }

}
