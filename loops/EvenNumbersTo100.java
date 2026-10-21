public class EvenNumbersTo100 {

    public static void main(String[] args) {

        int i = 2;

        while (i <= 100) {
        
            boolean isEven = i % 2 == 0;
            if (isEven) {
                System.out.print(i);
            } 

            i++;
        }
    }
}