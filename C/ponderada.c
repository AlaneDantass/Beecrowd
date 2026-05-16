#include<stdio.h>
int main(){
    float nota1,nota2,nota3,nota4;
    printf("Digite a primeira nota: ");
    scanf("%f",&nota1);
    printf("Digite a segunda nota: ");
    scanf("%f",&nota2);
    printf("Digite a terceira nota: ");
    scanf("%f",&nota3);
    printf("Digite a quarta nota: ");
    scanf("%f",&nota4);

    float media = (nota1 * 1 + nota2 * 2 + nota3 * 3 + nota4 * 4) / 10;
    printf("Média ponderada: %.2f\n", media);
    return 0;
}