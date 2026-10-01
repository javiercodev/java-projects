import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        int number = s.nextInt();
        int result = 0;

        for (int i = 0; i <= 10; i++) {
            result = number * i;
            System.out.println(number + " x " + i +" = " + result);
        }
    }
}