import java.util.Scanner;

public class ContemporaryFigures {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Juan's age: ");
        int ageJuan = s.nextInt();
        System.out.print("Enter Mario's age: ");
        int ageMario = s.nextInt();
        System.out.print("Enter Nia's age: ");
        int ageNia = s.nextInt();

        if (ageMario == ageJuan && ageNia == ageJuan){
            System.out.print("They are all the same age.");
        }else if (ageJuan == ageMario) {
            System.out.print("Juan and Mario.");
        } else if (ageJuan == ageNia) {
            System.out.print("Juan and Nia.");
        } else if ( ageMario == ageNia) {
            System.out.print("Mario and Nia.");
        } else {
            System.out.print("No one is the same age.");
        }
    }
}