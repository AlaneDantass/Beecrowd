#include <stdio.h>
int main(){
    int a,b;
    printf("Digite dois numeros: ");
    scanf("%d,%d,",&a,&b);
    if(a<b){
        printf("O menor numero e: %d",a);

    }else{
        printf("O menor numero e: %d",b);
    }
    return 0;
}