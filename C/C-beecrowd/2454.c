#include <stdio.h>
 
int main() {
    int P,R;
    scanf("%d\n",&P);
    scanf("%d",&R);
    
    if(P==1 && R==1){
        printf("A\n");
        
    }
    else if(P==1 && R==0){
        printf("B\n");
    }else if(P==0 && R==1){
        printf("C\n");
    }else if(P==0 && R==0){
        printf("C\n");
    }
 
    return 0;
}