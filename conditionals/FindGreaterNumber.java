import java.util.Scanner;

class Capture {
    Scanner s = new Scanner(System.in);
    
    public int getNumber() {
        System.out.print("Enter a number:");
        int enteredNumber = s.nextInt();
        return enteredNumber;
    }
}

public class FindGreaterNumber {

    public static void main(String[] args) {

        Capture c = new Capture();
        int firstValue = c.getNumber();
        int secondValue = c.getNumber();

        System.out.println("");


        // First check whether they are equal. If not, determine wich one is greater.
        String greater = (firstValue == secondValue) ? "They are equal" : 
                         (firstValue > secondValue) ? firstValue + " is the greater" : secondValue + " is the greater";

        System.out.print(greater);        
    }
}