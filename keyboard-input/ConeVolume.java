import java.util.Scanner;

public class ConeVolume {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce radio and height: ");

        double radio = s.nextDouble();
        double height = s.nextDouble();
        double pi = 3.1416;
        double radioPow = Math.pow(radio, 2);
        
        double volumen = (pi * radioPow * height) / 3;

        System.out.print(volumen);
    }
}