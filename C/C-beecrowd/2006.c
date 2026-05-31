#include <stdio.h>
 
int main() {
    int tipo;
    scanf("%d",&tipo);
    int A, B, C, D, E;
    scanf("%d%d%d%d%d",&A, &B, &C, &D, &E);
    int acertos =0;
    if(A == tipo){
        acertos+=1;
    }if(B == tipo){
        acertos+=1;
    }if(C == tipo){
        acertos+=1;
    }if(D == tipo){
        acertos+=1;
    }if(E == tipo){
        acertos+=1;
    }
    
    printf("%d\n",acertos);
    
  return 0;
}