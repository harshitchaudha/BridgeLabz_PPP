import java.util.*;

public class FactorsDynamic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.err.println("Invalid number.");
            return;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == factors.length) {
                    // grow array
                    int[] tmp = new int[factors.length * 2];
                    for (int j = 0; j < factors.length; j++) tmp[j] = factors[j];
                    factors = tmp;
                }
                factors[idx++] = i;
            }
        }

        System.out.print("Factors of " + n + ": ");
        for (int i = 0; i < idx; i++) {
            System.out.print(factors[i] + (i + 1 < idx ? " " : ""));
        }
        System.out.println();
        in.close();
    }
}
