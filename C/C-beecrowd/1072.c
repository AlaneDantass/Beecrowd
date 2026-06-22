#include<stdio.h>
int main(){
    int x;
    scanf("%d", &x);
    for(int i = 0; i<x; i++){
        int y;
        scanf("%d", &y);
        if(y>=10 && y<=20){
            printf("In\n");
        }else{
            printf("Out\n");
        }
    }
    return 0;
}