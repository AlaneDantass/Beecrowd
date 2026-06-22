#include<stdio.h>

int main(){
    int n, x, divisores=0;
    scanf("%d", &n);
    for(int j=0; j<n; j++){
        scanf("%d", &x);
        for(int i = 1; i<x; i++){
            if(x%i == 0){
                divisores++;
            }
        }
        if (divisores<=1 ){
            printf("%d eh primo\n", x);
        }else{
            printf("%d nao eh primo\n", x);
        }
        divisores = 0;
    }
    return 0;
}