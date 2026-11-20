import java.util.Scanner;

public class SearchStudentName {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String[] names = {"Javier", "Maria Jesus", "Eduardo", "Juan", "Ulises", "Mario", "Cristina", "Fernando"};
            String target = readName(s, "Enter a name: ");
            int position = findName(names, target);
            System.out.println(position == -1
                    ? "Name not found."
                    : target + " found at position " + position + "."
            );
        }
    }

    // Read the name entered by the user and remove surrounding whitespace.
    private static String readName(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextLine().trim();
    }

    // Search for the target name and return its index, or -1 if not found.
    private static int findName(String[] names, String target) {
        for (int i = 0; i < names.length; i++) {
            //
            if (names[i].equalsIgnoreCase(target)) { return i; }
        }
        return -1;
    }
}