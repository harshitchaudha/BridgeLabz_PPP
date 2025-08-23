import java.util.*;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] heights = new double[11];

        System.out.println("Enter heights of 11 players:");
        for (int i = 0; i < heights.length; i++) heights[i] = in.nextDouble();

        double sum = 0.0;
        for (double h : heights) sum += h;
        double mean = sum / heights.length;

        System.out.println("Mean height = " + mean);
        in.close();
    }
}
