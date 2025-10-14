#include <stdio.h>
#include <string.h>

int main() {
  int C;
  char nome[50];
  int forca;

  scanf("%d", &C);

  for (int i = 0; i < C; i++) {
    scanf("%s %d", nome, &forca);

    if (strcmp(nome, "Thor") == 0) {
      printf("Y\n");
    } else {
      printf("N\n");
    }
  }

  return 0;
}
