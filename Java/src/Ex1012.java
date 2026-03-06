import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", 
        (A*C)/2, (3.14159*Math.pow(C,2)), ((A+B)*C)/2, B*B, A*B);
//Primeiro escreve todo texto sem separar por linha, depois quebra a linha usando \n, 
// e depois escreve os valores formatados usando %.3f para cada valor.
        input.close();
    }
}
