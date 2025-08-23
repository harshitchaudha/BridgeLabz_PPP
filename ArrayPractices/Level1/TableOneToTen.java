import java.util.*;

public class TableOneToTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();

        int[] table = new int[10];
        for (int i = 1; i <= table.length; i++) {
            table[i - 1] = number * i;
        }

        for (int i = 1; i <= table.length; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
        in.close();
    }
}
