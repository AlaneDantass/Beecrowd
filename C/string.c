#include <stdio.h>
#include<string.h>


int main()
{
    char palavra1[100];
    int n = 10;
    
    char palavra2[100];
    int j = 20;
    
    printf("Digite  a string 1: \n");
    fgets(palavra1, n, stdin);
    printf("você digitou %s", palavra1);
    
    printf("Digite  a string 2: \n");
    fgets(palavra2, n, stdin);
    printf("você digitou %s", palavra2);
    
    printf("o tamanho da palavra 1 é %zu\n", strlen(palavra1));
    printf("O tamanho da palavra 2 é %zu\n", strlen(palavra2));
    
    strcmp(palavra1, palavra2);
    if(strcmp(palavra1, palavra2)){
        printf("As strings são iguais");
        
    }else{
        printf("As strings são diferentes");
    }
    
    return 0;
}