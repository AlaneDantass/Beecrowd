import java.util.Scanner;
public class Ex1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double salary = input.nextDouble();
        double sales = input.nextDouble();

        double commission =  sales * 0.15;
        double salaryTot =  commission + salary;
        System.out.printf("TOTAL = R$ %.2f\n", salaryTot); 
        input.close(); 
    }
}