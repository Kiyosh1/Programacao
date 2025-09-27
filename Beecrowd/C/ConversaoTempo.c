#include <stdio.h>

int main() {
  int tempo, hora, minuto, segundo;
  scanf("%d", &tempo);

  hora = tempo / 3600;
  tempo = tempo % 3600;

  minuto = tempo / 60;
  tempo = tempo % 60;

  segundo = tempo;

  printf("%d:%d:%d\n", hora, minuto, segundo);

  return 0;
}
