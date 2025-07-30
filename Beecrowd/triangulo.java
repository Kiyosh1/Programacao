import java.util.Scanner;

public class triangulo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    float a, b, c,perimetro, area;


    a = input.nextFloat();
    b = input.nextFloat();
    c = input.nextFloat();
    perimetro = a + b + c;
    area = ((a+b) * c) / 2;

    if (a + b > c && a + c > b && b + c > a){
        System.out.printf("Perimetro = %.1f%n", perimetro);
    }
    else {
        System.out.printf("Area = %.1f%n", area);
    }
    input.close();
  }
}
