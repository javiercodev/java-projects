import java.util.Scanner;

public class RemoveLowestRating {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce the first rating: ");
        double rating1 = s.nextDouble();
        System.out.print("Introduce the second rating: ");
        double rating2 = s.nextDouble();
        System.out.print("Introduce the third rating: ");
        double rating3 = s.nextDouble();
        double average = 0.0;

        if (rating1 > rating2 && rating3 > rating2) {
            average = (rating1 + rating3) / 3;
            System.out.print("Average of " + rating1 + " and " + rating3 + " is: " + average);
        } else if (rating2 > rating1 && rating3 > rating1) {
            average = (rating2 + rating3) / 3;
            System.out.print("Average of " + rating2 + " and " + rating3 + " is: " + average);
        } else {
            average = (rating1 + rating2) / 3;
            System.out.print("Average of " + rating1 + " and " + rating2 + " is: " + average);
        }
    }
}
