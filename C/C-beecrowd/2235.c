#include <stdio.h>
 
int main() {
    int credito1, credito2, credito3;

    scanf("%d %d %d", &credito1, &credito2, &credito3);

    if (credito1 + credito2 - credito3 == 0 ||
        credito2 + credito3 - credito1 == 0 ||
        credito1 + credito3 - credito2 == 0) {

        printf("S\n");

    }else if (credito1-credito2 ==0 ||
              credito2-credito3==0||
              credito1-credito3==0) {

        printf("S\n");

    }else{

        printf("N\n");

    }
 
    return 0;
}

