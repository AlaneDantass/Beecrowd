#include <stdio.h>

int main() {
  int idade = 0;
  int soma = 0;
  int contador = 0;
  while (idade >= 0) {
    scanf("%d", &idade);
    soma += idade;
    contador++;
  }

  contador--;
  soma -= idade;

  float media = (float)soma/ contador;
  printf("%.2f\n", media);

  return 0;
}