import java.util.Scanner;

public class ScanerClass02 {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce your name and your age: ");
        String name = s.next();
        int age = s.nextInt();

        System.out.println("Your name is " + name + " and your age is " + age);
    }
}