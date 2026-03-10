import java.util.Scanner;
public class teste {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        int E = input.nextInt();
        int quantity = 0;
        

        if (A == type ){
            quantity++;  // incrementa}
        }
        if (B == type ){
            quantity++;  // incrementa}
        }
        if (C == type ){
            quantity++;  // incrementa}
        }
        if (D == type ){
            quantity++;  // incrementa}
        }
        if (E == type ){
            quantity++;  // incrementa}
        }
        
        System.out.println("Acertaram "+ quantity);
        input.close();
    }
}
