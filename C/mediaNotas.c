#include <stdio.h>

// Alterei o nome para evitar conflito com a variável
int calcular_soma(int notas[], int tamanho) {
    int acumulador = 0;
    for (int i = 0; i < tamanho; i++) {
        printf("Digite a nota %d: ", i + 1);
        scanf("%d", &notas[i]); // Adicionado o '&'
        acumulador += notas[i];
    }
    return acumulador; // Return movido para FORA do for
}

float calcular_media(int soma, int tamanho) {
    // (float) faz a conversão para não perder as casas decimais
    return (float)soma / tamanho; 
}

int main() {
    int tamanho;
    
    printf("Digite a quantidade de notas: ");
    scanf("%d", &tamanho);

    int notas[tamanho];
    
    // Nomes de variáveis diferentes dos nomes das funções
    int total_soma = calcular_soma(notas, tamanho);
    float media_final = calcular_media(total_soma, tamanho);

    printf("\nA soma e: %d", total_soma);
    printf("\nA media e: %.2f\n", media_final);

    return 0;
}