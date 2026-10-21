public class Countdown {

    public static void main(String[] args) throws InterruptedException{

        // The current time in millisecond
        long start = System.currentTimeMillis();

        System.out.println("With for: ");

        // For:
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            // Display the number every 1000 milliseconds (1 second).
            Thread.sleep(1000);
            if (i == 1) System.out.println("go!");
        }

        System.out.println("Now, with while: ");

        int i = 3;
        // While:
        while (i > 0) {
            System.out.println(i);
            // Display the number every 1000 milliseconds (1 second).
            Thread.sleep(1000);
            if (i == 1) System.out.println("go!");
            i--;
        }
    }
}