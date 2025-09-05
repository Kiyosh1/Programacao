#include <stdio.h>

int main() {

  int funcionario;
  int horas;
  double salario;

  scanf("%d", &funcionario);
  scanf("%d", &horas);
  scanf("%lf", &salario);

  printf("NUMBER = %d\n", funcionario);
  printf("SALARY = U$ %.2lf\n", horas * salario);

  return 0;
}
