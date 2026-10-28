public class ReverseDaysOfWeek {

    public static void main(String[] args) {

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = week.length - 1; i >= 0; i--) {
            System.out.print(week[i] + " ");
        }
    }
}