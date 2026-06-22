#include <stdio.h>
 
int main() {
    int n,m, soma=0;
    while (1){
        scanf("%d %d", &n, &m);
        if (n<=0 || m<=0)
            break;
        if (n>m){
            int aux = n;
            n=m;
            m=aux;
        }
        for(int i = n; i <= m; i ++){
            printf("%d ", i);
            soma+=i;
        }
        printf("Sum=%d\n", soma);
        soma = 0;
    }
 
    return 0;
}