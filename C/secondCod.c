#include <stdio.h>
int main(){
    int Days; // declarada
    double years;  // Changed to double for better precision
    printf("Enter the number of days: ");
    scanf("%d", &Days); // inicializada
    years = Days / 365.0;  // No cast needed; 365.0 is double, Days promotes to double
    printf("%d days is approximately %.2f years.\n", Days, years);
    return 0;
}