import java.util.Scanner;

public class GradeConverter {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce your grade: ");
        char grade = s.next().charAt(0);

        switch(grade) {
            case 'A':
            case 'a':
                System.out.print("Outstanding!");
                break;
            case 'B':
            case 'b':
                System.out.print("Notable");
                break;
            case 'C':
            case 'c':
                System.out.print("Approved");
                break;
            case 'F':
            case 'f':
                System.out.print("Suspended");
                break;
        }
    }
}