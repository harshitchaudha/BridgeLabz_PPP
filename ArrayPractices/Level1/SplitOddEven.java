import java.util.*;

public class SplitOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a natural number N: ");
        int number = in.nextInt();

        if (number <= 0) {
            System.err.println("Error: not a natural number.");
            return;
        }

        int size = number / 2 + 1; // safe upper bound
        int[] evens = new int[size];
        int[] odds = new int[size];
        int ei = 0, oi = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) evens[ei++] = i;
            else odds[oi++] = i;
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oi; i++) System.out.print(odds[i] + (i + 1 < oi ? " " : ""));
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < ei; i++) System.out.print(evens[i] + (i + 1 < ei ? " " : ""));
        System.out.println();

        in.close();
    }
}
