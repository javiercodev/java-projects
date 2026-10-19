import java.util.ArrayList;
import java.util.Random;

public class GroupEvenOddNumbers {

    public static void main(String[] args) {

        // Assign random numbers between 0-100 to the positions(20) in n[].
        int[] n = new int[20];
        Random r = new Random();
        for (int i = 0; i < n.length; i++) {
            int randomNumber = r.nextInt(101);
             n[i] = randomNumber;
             System.out.println(n[i]);
        }

        System.out.println("");

        // Create dynamic array to store the even values from n[].
        ArrayList<Integer> groupEven = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                int even = n[i];
                groupEven.add(even);
            } 
        }

        // Create dynamic array to store the odd values from n[].
        ArrayList<Integer> groupOdd = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                int odd = n[i];
                groupOdd.add(odd);
            } 
        }

        // Create a final array that stores the groupEven values first, followed by the groupOdd values.
        int[] groupEvenOdd = new int[groupEven.size() + groupOdd.size()];

        // Save the position for the final array.
        int index = 0;

        // Assign the groupEven values to the corresponding positions.
        for (int num : groupEven) {
            groupEvenOdd[index] = num; 
            index ++;
        }

        // Assign the groupOdd values to the corresponding positions.
        for (int num : groupOdd) {
            groupEvenOdd[index] = num;
            index++;
        }

        // Finally, show that:
        System.out.println("Group");
        for (int num : groupEvenOdd) {
            System.out.println(num);
        }
    }
}
