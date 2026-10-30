import java.util.Scanner;

public class ClassGradeStatistics {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numStudents;
        boolean isRange = false;
        do {
            System.out.print("Enter the number of students: ");
            numStudents = s.nextInt();
            isRange = numStudents > 0;
            if (!isRange) {
                System.out.println("invalid number!");
            }
        } while (!isRange);

        int[] gradeStudents = new int[numStudents];
        boolean isGrade = false;
        int sum = 0;
        for (int i = 0; i < gradeStudents.length; i++) {
            do {
                System.out.print("Enter the grade for the student " + (i + 1) + ": ");
                int grade = s.nextInt();
                isGrade = grade >= 0 && grade <=10;
                if (isGrade) {
                    gradeStudents[i] = grade;
                    sum += gradeStudents[i];
                } else {
                    System.out.println("invalid grade!");
                }
                
            } while(!isGrade);
        }

        s.close();

        double average = (double) sum / numStudents;
    
        int approved = 0;
        int suspended = 0;
        int superior = 0;
        for (int j : gradeStudents) {
            if (j >= 5) {
                approved++;
            } else {
                suspended++;
            }

            if (j > average) {
                superior++;
            }
        }

        System.out.println("Approved: " + approved);
        System.out.println("Suspended: " + suspended);
        System.out.println("Above average: " + superior);
    }
}