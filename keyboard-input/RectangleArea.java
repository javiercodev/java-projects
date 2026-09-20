import java.util.Scanner;

public class RectangleArea {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce base and height: ");

        double base = s.nextDouble();
        double height = s.nextDouble();
        double area = base * height;

        System.out.print(area);
    }
}