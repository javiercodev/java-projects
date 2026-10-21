import java.util.Scanner;

public class TriangleClassifier{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter lenght vertex v1: ");
        int v1 = s.nextInt();
        System.out.print("Enter lenght vertex v2: ");
        int v2 = s.nextInt();
        System.out.print("Enter lenght vertex v3: ");
        int v3 = s.nextInt();
        s.close();

        // Ensure that the side lenghts can form a triangle.
        boolean isTriangle = v1 + v2 > v3
                           && v1 + v3 > v2
                           && v2 + v3 > v1;  
        if (!isTriangle) {
            System.out.print("unable to form a triangle!");
        } else {
            String triangleType = (v1 == v2 && v2 == v3) ? "Equilateral."
                            : (v1 == v2 || v1 == v3 || v2 == v3) ? "Isosceles"
                            : "Escalene";
            System.out.print(triangleType);
        }
    }
}