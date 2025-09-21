#include <stdio.h>

int main() {
  double distancia, horas, velocidade;
  scanf("%lf", &horas);
  scanf("%lf", &velocidade);

  distancia = horas * velocidade / 12;

  printf("%.3lf\n", distancia);

  return 0;
}
