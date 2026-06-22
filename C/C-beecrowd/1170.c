#include <stdio.h>
 
int main() {
    int n,dias=0;
    scanf("%d", &n);
    double kg;
    for(int i = 0; i<n; i++){
        scanf("%lf", &kg);
        while (kg >1.0){
            kg = kg/2;
            dias++;

        }
        printf("%d dias\n", dias);
        dias =0;
        
    }
    return 0;
}
 
    
