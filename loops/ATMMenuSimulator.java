import java.util.Scanner;

public class ATMMenuSimulator {

    public static void main(String[] args) {

        double balance = 1000;
        boolean isExit = false;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Options:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter a number: ");
            char selectedOption = s.next().charAt(0);

            switch (selectedOption) {
                case '1':
                    System.out.println();
                    System.out.println("Balance: " + balance);
                    break;
                case '2':
                    System.out.print("Enter the money to deposit: ");
                    int deposit = s.nextInt();
                    balance += deposit;
                    break;
                case '3':
                    System.out.print("Enter the money to withdraw: ");
                    int withdraw = s.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                    } else {
                        System.out.println();
                        System.out.println("You're screwed, dude.");
                    }
                    break;
                case '4':
                    isExit = selectedOption == '4';
                    System.out.println();
                    System.out.println("arrivederci!");
                    break;
                default:
                    System.out.println();
                    System.out.println("invalid option!");
            }
            System.out.println();
        } while (!isExit);

        s.close();
    }
}