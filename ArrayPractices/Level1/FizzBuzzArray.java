import java.util.*;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.err.println("Invalid input.");
            return;
        }

        String[] res = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 15 == 0 && i != 0) res[i] = "FizzBuzz";
            else if (i % 3 == 0 && i != 0) res[i] = "Fizz";
            else if (i % 5 == 0 && i != 0) res[i] = "Buzz";
            else res[i] = String.valueOf(i);
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println("Position " + i + " = " + res[i]);
        }
        in.close();
    }
}
