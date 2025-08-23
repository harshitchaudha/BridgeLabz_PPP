import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = in.nextLong();

        String numStr = Long.toString(number);
        int n = numStr.length();
        char[] reversed = new char[n];

        for (int i = 0; i < n; i++) {
            reversed[i] = numStr.charAt(n - i - 1);
        }

        System.out.print("Reversed number: ");
        for (char c : reversed) System.out.print(c);
        System.out.println();
        in.close();
    }
}
