import java.util.Scanner;

public class FindEmployeeSalary {

    private static final String[] EMPLOYEES = {"Claudia", "Carlos", "Nuria", "Francisco"};
    private static final int[] SALARY = {1250, 1010, 750, 920};
    private static final String EXIT_WORD = "exit";
    private static final int NOT_FOUND = -1;

    public static void main(String[] args) {
        if (EMPLOYEES.length != SALARY.length) {
            System.out.println("invalid data: names and salaries must have the same lenght!");
            return;
        }
        try (Scanner s = new Scanner(System.in)) {
            while (true) {
                String name = readName(s, "Employee name ('" + EXIT_WORD + "' to quit): ");
                if (name.equalsIgnoreCase(EXIT_WORD)) { break; }
                int index = indexOf(EMPLOYEES, name);
                System.out.println(index == NOT_FOUND
                        ? "Employee \"" + name + "\" not found."
                        : EMPLOYEES[index] + " earns " + SALARY[index]
                );
            }
        }
    }

    // Asks for a non-empty text, repeating until the user types something.
    private static String readName(Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            String text = s.nextLine().trim();
            if (!text.isEmpty()) {
                return text;
            }
            System.out.println("the name cannot be empty!");
        }
    }

    // Returns the position of the name (ignoring case), or NOT_FOUND.
    private static int indexOf(String[] names, String target) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) { return i; }
        }
        return NOT_FOUND;
    }
}