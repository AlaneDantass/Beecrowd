#include<stdio.h>
#include<math.h>

int main(){
    float valor;
    float list[12] = {100, 50, 20, 10, 5, 2, 1, 0.5, 0.25, 0.10, 0.05, 0.01};
    
    printf("Digite o valor: ");
    scanf("%f",&valor);  // ✅ %f para float

    for(int i = 0; i < 12; i++){
        int quantidade = valor / list[i];
        valor = fmod(valor, list[i]);  // ✅ sem redeclarar, sem %
        if(quantidade != 0){
            printf("%d nota(s)/moeda(s) de R$ %.2f\n", quantidade, list[i]); // ✅ %d para int
        }
    }

    return 0;
}
