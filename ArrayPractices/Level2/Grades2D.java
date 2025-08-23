import java.util.*;

public class Grades2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();

        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks in Physics: ");
            marks[i][0] = in.nextInt();
            System.out.print("Enter marks in Chemistry: ");
            marks[i][1] = in.nextInt();
            System.out.print("Enter marks in Maths: ");
            marks[i][2] = in.nextInt();

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        System.out.println("Phy	Chem	Math	%	Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + "	" + marks[i][1] + "	" + marks[i][2] + "	" + percent[i] + "	" + grade[i]);
        }
        in.close();
    }
}
