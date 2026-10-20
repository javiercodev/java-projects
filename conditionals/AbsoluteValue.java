import java.util.Scanner;

class Capture {
    Scanner s = new Scanner(System.in);
    
    public int getNumber() {
        System.out.print("Enter a number:");
        int enteredNumber = s.nextInt();
        return enteredNumber;
    }
}

public class AbsoluteValue {

    public static void main(String[] args) {

        Capture c = new Capture();
        int num = c.getNumber();
        
        num = (num < 0) ? num * -1 : num;

        System.out.print(num);
    }
}