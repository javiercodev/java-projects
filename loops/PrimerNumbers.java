import java.util.Scanner;

public class PrimerNumbers {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        int number = s.nextInt();
        int comparacion = 0;
        int constant = number;
        int taa = 0;

        int i = 2;

        while (i > 1 && i < number) {
            System.out.print(i);

            constant = constant % i;
            number = constant;
            if (number != 0) {
                System.out.print("Primitivo");
            }
            i++;
        }
    }
}