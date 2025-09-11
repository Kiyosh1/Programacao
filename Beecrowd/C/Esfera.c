#include <math.h>
#include <stdio.h>
int main() {

  double n;
  scanf("%lf", &n);

  double raio = pow(n, 3);
  double pi = 3.14159;

  printf("VOLUME = %.3lf\n", 4.0 / 3 * pi * raio);

  return 0;
}
