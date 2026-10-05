import java.util.Scanner;

public class CountNumbers{

    public static void main(String[] args){
       
        Scanner s = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        int i = 0;

        do{
            i++;
            System.out.print("Introduce a number:");
            number = s.nextInt();
            sum = sum + number;

        } while (sum <= 10000);
        System.out.println("Cumulative total: " + sum);
        System.out.println("Entered numbers: " + i);
        double average = sum / i;
        System.out.println("Average: " + average);
    }
}