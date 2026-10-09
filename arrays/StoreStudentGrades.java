import java.util.Scanner;

public class StoreStudentGrades {

    public static void main(String[] args) {

        double grade[] = new double[4];

        Scanner s = new Scanner(System.in);

        System.out.println("The system needs to know your exam grades...");

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the grade for exam " + (i+1) + ":");
            grade[i] = s.nextDouble();
        }

        s.close();

        System.out.print("Your grades are: ");
        double sum = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.print(grade[i] + " ");
            sum = sum + grade[i];
        }

        System.out.println();
        System.out.print("The average is: " + (sum / 4));
    }
}