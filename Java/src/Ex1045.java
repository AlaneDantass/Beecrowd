import java.util.Scanner;
public class Ex1045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[3];
        array[0] = input.nextDouble();
        array[1] = input.nextDouble();
        array[2] = input.nextDouble();

        double smaller = 0.0;
        double middle = 0.0;
        double largest = 0.0;
        
        if (array[0] > array[1] && array[0] > array[2]){
            largest = array[0];
            if (array[1] > array[2]){
                middle = array[1];
                smaller = array[2];
            } else {
                middle = array[2];
                smaller = array[1];
            }
        } else if (array[1] > array[0] && array[1] > array[2]){
            largest = array[1];
            if (array[0] > array[2]){
                middle = array[0];
                smaller = array[2];
            } else {
                middle = array[2];
                smaller = array[0];
            }
        } else if (array[0]< array[1]&& array[1]==array[2]){
            largest = array[1];
            middle = array[1];
            smaller = array[0];
        } else if (array[1]< array[0]&& array[0]==array[2]){
            largest = array[0];
            middle = array[0];
            smaller = array[1];
        } else if (array[2]< array[0]&& array[0]==array[1]){
            largest = array[0];
            middle = array[0];
            smaller = array[2];
        } else {
            largest = array[0];
            middle = array[1];
            smaller = array[2];
        }
        
        //TRIANGLES
        
        if(Math.sqrt(largest) == Math.sqrt(middle) + Math.sqrt(smaller)){
            System.out.println("TRIANGULO RETANGULO");
        }
        if(Math.sqrt(largest)<Math.sqrt(middle)+Math.sqrt(smaller)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(largest==middle && middle==smaller){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if(Math.sqrt(largest)>Math.sqrt(middle)+Math.sqrt(smaller)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if(largest==middle || largest==smaller || middle==smaller){
            System.out.println("TRIANGULO ISOSCELES");
        }else {
            System.out.println("NAO FORMA TRIANGULO");
        }
        input.close();
        }
    }