import java.util.*;

public class FiveNumberAnalysis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();

        for (int n : arr) {
            if (n > 0) {
                System.out.print(n + " is positive and ");
                System.out.println((n % 2 == 0) ? "even." : "odd.");
            } else if (n < 0) {
                System.out.println(n + " is negative.");
            } else {
                System.out.println("0 is zero.");
            }
        }

        int first = arr[0], last = arr[arr.length - 1];
        if (first == last) System.out.println("First and last elements are equal.");
        else if (first > last) System.out.println("First element is greater than last.");
        else System.out.println("First element is less than last.");
        in.close();
    }
}
