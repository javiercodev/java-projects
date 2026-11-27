import java.util.Arrays;

public class SortNames {

    public static void main(String[] args) {
        String[] names = {"Carlos", "Ana", "Pedro", "Lucia", "Miguel", "Beatriz"};
        sortNames(names);
        System.out.println("Result: " + Arrays.toString(names));
        
    }

    private static void sortNames(String[] names) {
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1 -i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String aux = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = aux;
                }
            }
        }
    }
}