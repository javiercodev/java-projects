import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        int num = s.nextInt();
        s.close();

        int result = 1;

        for (int i = 0; i < num; i++) {
            int now =  num - i;
            result = result * now;
            System.out.println(result);
        }
    }
}