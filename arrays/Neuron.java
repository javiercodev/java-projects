public class Neuron {

    public static void main(String[] args) {
        double[] weights = {1.0, 1.0};
        double bias = -1.5; // AND: -1.5, OR: 0.5
        double[][] cases = {{0,0}, {0,1}, {1,0}, {1,1}};
        for (int i = 0; i < cases.length; i++) {
            int result = output(cases[i], weights, bias);
            System.out.println(cases[i][0] + " AND " + cases[i][1] + " = " + result);
        }

    }

    // Calculates the sum of inputs[i] * weights[i] plus the bias.
    private static double weightedSum(double inputs[], double weights[], double bias) {
        double sum = bias;
        for (int i = 0; i < inputs.length; i++) {
            sum += inputs[i] * weights[i];
        }
        return sum;
    }

    // Returns 1 if the sum is greater than 0, otherwise 0.
    private static int activation(double sum) {
        if (sum > 0) { return 1; }
        return 0;
    }

    // Passes the inputs through the neuron and returns its output.
    private static int output(double inputs[], double weights[], double bias) {
        double sum = weightedSum(inputs, weights, bias);
        return activation(sum);
    }
}
