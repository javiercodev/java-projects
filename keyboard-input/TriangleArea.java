import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce base and height: ");

        double base = s.nextDouble();
        double height = s.nextDouble();
        double area = (base * height) / 2;

        System.out.print(area);
    }
    
}
