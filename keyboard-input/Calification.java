import java.util.Scanner;

public class Calification{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce the calification one: ");
        double calificationOne = Double.parseDouble(s.nextLine());

        System.out.print("Introduce your wished evaluation: ");
        double evaluationWished = Double.parseDouble(s.nextLine());

        double calificationTwo = (evaluationWished - (calificationOne * 0.40)) / 0.60;

        System.out.print("Your need to get a: " + calificationTwo);
    }
}