import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double N1 = input.nextDouble();
    double N2 = input.nextDouble();
    
    double MEDIA = ((3.5*N1)+(7.5*N2))/11;
    System.out.printf("MEDIA = %.5f\n",MEDIA);
    
    }   
}
