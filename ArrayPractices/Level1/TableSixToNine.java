import java.util.*;

public class TableSixToNine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();

        int[] result = new int[4]; // for 6,7,8,9
        int k = 0;
        for (int i = 6; i <= 9; i++) {
            result[k++] = number * i;
        }

        k = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[k++]);
        }
        in.close();
    }
}
