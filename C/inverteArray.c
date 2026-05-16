#include <stdio.h>
void inverte(int arr[], int tamanho) {
    int variavel;
    
    
    for (int i = 0; i < tamanho/2; i++) {
        variavel = arr[i];
        arr[i] = arr[tamanho - 1 - i];
        arr[tamanho - 1 - i] = variavel;
    }
    
}

int main()
{
    int listinha [ ] = {10,20,30,40,50};
    int tamanho = 5;
    
    inverte(listinha, tamanho);
    
    for (int i = 0; i < tamanho; i++) {
        printf("%d ", listinha[i]);
    }

    return 0;
}