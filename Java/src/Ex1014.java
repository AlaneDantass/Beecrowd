import java.util.Scanner;
public class Ex1014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        double fuel = input.nextDouble();
        
        double consumption = distance / fuel;
        System.out.printf("%.3f km/l\n", consumption);
        input.close();
    }
}
