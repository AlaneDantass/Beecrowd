import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double MEDIA = (((2*A) + (3*B) + (5*C))/ 10);
        
        System.out.printf("MEDIA = %.1f\n", MEDIA);
        input.close();
    }
}