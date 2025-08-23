import java.util.*;

public class MatrixToArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = in.nextInt();
        System.out.print("Cols: ");
        int cols = in.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.err.println("Invalid dimensions.");
            return;
        }

        int[][] mat = new int[rows][cols];
        System.out.println("Enter " + (rows * cols) + " integers:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = in.nextInt();

        int[] flat = new int[rows * cols];
        int k = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                flat[k++] = mat[i][j];

        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) System.out.print(mat[i][j] + " ");
            System.out.println();
        }

        System.out.println("Copied 1D array:");
        for (int i = 0; i < flat.length; i++)
            System.out.print(flat[i] + (i + 1 < flat.length ? " " : ""));
        System.out.println();

        in.close();
    }
}
