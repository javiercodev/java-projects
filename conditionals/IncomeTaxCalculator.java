import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Gross annual salary: ");
        double salary = s.nextDouble();

        System.out.print("Number of dependent children: ");
        int children = s.nextInt();
        switch (children) {
        case 0:
            salary = salary;
            break;
        case 1:
            salary = salary - 2000;
            break;
        case 2:
            salary = salary - 4000;
            break;
        default:
             salary = salary - 6000;
       }

        System.out.print("Disability grade(0 = None | 1 = More than 33% | 2 = More than 65%: ");
        int disability = s.nextInt();
       switch(disability) {
        case 0: 
            salary = salary;
            break;
        case 1:
            salary = salary - 3000;
            break;
        case 2:
            salary = salary - 9000;
            break;
        default:
            System.out.print("Error: Disability grade(0 = None | 1 = More than 33% | 2 = More than 65%).");
            return;
       }

       if (salary == 0) {
        salary = 0;
       }
       
       double retention19 = 0;
       double retention24 = 0;
       double retention30 = 0;
       double retention37 = 0;
       double add = 0;

       // Marginal Bracket Calculation.
       if (salary <= 12450) {
            retention19 = salary * 0.19;
       } else if (salary > 12450 && salary <= 20200) {
            retention19 = 12450 * 0.19;
            salary = salary - 12450;
            retention24 = salary * 0.24;
            add = retention19 + retention24;
       } else if (salary > 20200 && salary <= 35200) {
            retention19 = 12450 * 0.19;
            retention24 = 7750 * 0.24;
            salary = salary - 20200;
            retention30 = salary * 0.30;
            add = retention19 + retention24 + retention30;
        } else if ( salary > 35200) {
            retention19 = 12450 * 0.19;
            retention24 = 7750 * 0.24;
            retention30 = 15000* 0.30;
            salary = salary - 35200;
            retention37 = salary * 0.37;
            add = retention19 + retention24 + retention30 + retention37;
        }

        System.out.print("Retention: " + add + " $");
    }
}