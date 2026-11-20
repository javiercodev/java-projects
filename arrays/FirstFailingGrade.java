public class FirstFailingGrade {
    
    public static void main(String[] args) {
        double[] grade = {8.5, 9.5, 2.7, 6.25, 4.8, 1.05, 5.5};
        int position = firstFailing(grade);
        System.out.println(position == -1
                ? "There are no failing grades."
                : "First failing at position: " + position
        );
    }

    // Return the index of the first failing grade, or -1 if there are none.
    private static int firstFailing(double[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 5) { return i; }
        }
        return -1;
    }
}
