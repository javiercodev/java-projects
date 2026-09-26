import java.util.Random;

public class DiceRoll {

    public static void main(String[] args) {

        Random random = new Random();

        int min = 1;
        int max = 6;

        int dice1 = random.nextInt((max - min) + 1) + min;
        int dice2 = random.nextInt((max - min) + 1) + min;
        int dice3 = random.nextInt((max - min) + 1) + min;

        if (dice1 == 6 && dice2 == 6 && dice3 == 6) {
            System.out.print("Perfect!");
        } else if ((dice1 == 6 && dice2 == 6 && dice3 != 6) || (dice1 == 6 && dice2 != 6 && dice3 == 6) || (dice1 != 6 && dice2 == 6 && dice3 == 6)) {
            System.out.print("Not bad, not bad");
        } else if (dice1 == 6 || dice2 == 6 || dice3 == 6) {
            System.out.print("Tolerable");
        } else {
            System.out.print("Catastrophic");
        }
    }
}