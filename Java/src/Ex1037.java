import java.util.Scanner;
public class Ex1037 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double A = input.nextDouble();
        if(0<=A && A<=25){
            System.out.println("Intervalo [0,25]");
        } else if(25<A && A<=50){
            System.out.println("Intervalo (25,50]");
        } else if(50<A && A<=75){
            System.out.println("Intervalo (50,75]");
        } else if(75<A && A<=100){
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        input.close();

    }
}


