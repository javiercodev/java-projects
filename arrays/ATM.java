import java.util.Scanner;

public class ATM {

    private static final double INITIAL_MONEY = 1000;
    private static final int HISTORY_SIZE = 10;
    private static final int EMPTY_SLOT = 0;

    // Menu options (they are also the codes stored in the history).
    private static final int CHECK_BALANCE = 1;
    private static final int DEPOSIT_MONEY = 2;
    private static final int WITHDRAW_MONEY = 3;
    private static final int TRANSACTION_HISTORY = 4;
    private static final int EXIT = 5;

    private static final String[] MENU_OPTIONS = { "Check balance", "Deposit money", "Withdraw money", "Transaction history", "Exit" };
    
    public static void main(String[] args) {
        double balance = INITIAL_MONEY;
        int[] operations = new int[HISTORY_SIZE];
        boolean running = true;
        try (Scanner s = new Scanner(System.in)) {
            while (running) {
                showMenu();
                int option = readOption(s, "Enter an option: ");
                switch (option) {
                    case CHECK_BALANCE  -> { checkBalance(balance); saveTransaction(operations, option); }
                    case DEPOSIT_MONEY  -> { balance = depositMoney(s, balance); saveTransaction(operations, option); }
                    case WITHDRAW_MONEY -> { balance = withdrawMoney(s, balance); saveTransaction(operations, option); }
                    case TRANSACTION_HISTORY -> transactionHistory(operations); // Not saved in the history itself.
                    case EXIT -> running = false;
                }
            }
        }
        System.out.println("Thank you for using the ATM. Goodbye!");
    }

    // Prints the main menu.
    private static void showMenu() {
        System.out.println("========== ATM MENU ==========");
        for (int i = 0; i < MENU_OPTIONS.length; i++) {
            System.out.println((i + 1) + ". " + MENU_OPTIONS[i]);
        }
    }

    // Prints the stored operations from the oldest to newest.
    private static void transactionHistory(int[] operations) {
        boolean isEmpty = true;
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case CHECK_BALANCE  -> System.out.println((i + 1) + ". You have checked your balance");
                case DEPOSIT_MONEY  -> System.out.println((i + 1) + ". You have deposited money");
                case WITHDRAW_MONEY -> System.out.println((i + 1) + ". You have withdrawn money");
            }
            if (operations[i] != EMPTY_SLOT) { isEmpty = false; }
        }
        if (isEmpty) { System.out.println("there are no transactions yet!"); }
    }

    // Saves an operation in the first free slot; if the history is full, the oldest one is lost.
    private static void saveTransaction(int[] operations, int value) {
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == EMPTY_SLOT) { operations[i] = value; return ; }
        }
        
        // History full: shift everything left and add the new one at the end.
        for (int i = 0; i < operations.length - 1; i++) {
            operations[i] = operations[i + 1];
        }
        operations[operations.length - 1] = value;
    }

    // Prints the current balance with two decimals.
    private static void checkBalance(double balance) {
        System.out.printf("Your current balance is: %.2f%n", balance);
    }

    // Asks for an amount and returns the balance after adding it.
    private static double depositMoney(Scanner s, double balance) {
            double deposit = readPositiveMoney(s, "Enter the amount to deposit: ");
            return balance + deposit;
    }

    // Asks for an amount (not greater than the balance) and returns the balance after subtracting it.
    private static double withdrawMoney(Scanner s, double balance) {
        while (true) {
            double withdraw = readPositiveMoney(s, "Enter the amount to withdraw: ");
            if (balance >= withdraw) { return balance - withdraw; }
            System.out.println("you cannot withdraw more money than the available balance!");
        }
    }

    // Asks for a number greater than zero, repeating until valid.
    private static double readPositiveMoney(Scanner s, String prompt) {
        while (true) {
            double amount = readMoney(s, prompt);
            if (amount > 0) { return amount; }
            System.out.println("negative amounts and zero are not allowed!");
        }
    }

    // Asks for a decimal number, repeating until it can be parsed.
    private static double readMoney (Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(s.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("invalid input!");
            }
        }
    }

    // Asks for a menu option between CHECK_BALANCE and EXIT, repeating until valid.
    private static int readOption (Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int option = Integer.parseInt(s.nextLine().trim());
                if (option >= CHECK_BALANCE && option <= EXIT) { return option; }
                System.out.println("invalid option!");
            } catch (NumberFormatException e) {
                System.out.println("invalid input!");
            }
        }
    }
}