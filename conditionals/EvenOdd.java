import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce a number(int): ");
        int number = s.nextInt();

        if(number % 2 == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }        
    }
}