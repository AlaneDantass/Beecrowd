#include<stdio.h>
int main(){
    int n,x,soma = 0;
    scanf("%d", &n);
    for (int j = 0; j <n; j++){
        scanf("%d", &x);
        for(int i = 1; i<x; i++){
            if(x%i == 0){
            soma+= i; 
           //printf("%d\n",i);
        }
        }
        if(soma == x){
            printf("%d eh perfeito\n", x);
        }else{
            printf("%d nao eh perfeito\n", x);
        }
        soma = 0;
    }

    
    
    return 0;
}