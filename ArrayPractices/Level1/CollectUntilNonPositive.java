import java.util.*;

public class CollectUntilNonPositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] nums = new double[10];
        int idx = 0;
        System.out.println("Enter positive numbers (0 or negative to stop):");

        while (true) {
            if (idx == nums.length) break;
            double x = in.nextDouble();
            if (x <= 0) break;
            nums[idx++] = x;
        }

        double total = 0.0;
        System.out.println("Numbers entered:");
        for (int i = 0; i < idx; i++) {
            System.out.println("[" + i + "] = " + nums[i]);
            total += nums[i];
        }
        System.out.println("Sum = " + total);
        in.close();
    }
}
