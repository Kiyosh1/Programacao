#include <stdio.h>

int main() {
  int a, b, c;
  int originais[3];

  scanf("%d %d %d", &a, &b, &c);

  originais[0] = a;
  originais[1] = b;
  originais[2] = c;

  if (a > b) {
    int temp = a;
    a = b;
    b = temp;
  }
  if (a > c) {
    int temp = a;
    a = c;
    c = temp;
  }
  if (b > c) {
    int temp = b;
    b = c;
    c = temp;
  }

  printf("%d\n", a);
  printf("%d\n", b);
  printf("%d\n", c);

  printf("\n");

  printf("%d\n", originais[0]);
  printf("%d\n", originais[1]);
  printf("%d\n", originais[2]);

  return 0;
}
