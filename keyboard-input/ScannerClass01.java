import java.util.Scanner;

public class ScannerClass01 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Your name :");
        String name = s.nextLine();

        System.out.print("Your age :");
        int age = Integer.parseInt( s.nextLine());

        System.out.println("Your name is " + name + " and your age is " + age);
    }
}