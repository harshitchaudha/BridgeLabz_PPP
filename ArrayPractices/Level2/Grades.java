import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();

        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks in Physics: ");
            phy[i] = in.nextInt();
            System.out.print("Enter marks in Chemistry: ");
            chem[i] = in.nextInt();
            System.out.print("Enter marks in Maths: ");
            math[i] = in.nextInt();

            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        System.out.println("Phy	Chem	Math	%	Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(phy[i] + "	" + chem[i] + "	" + math[i] + "	" + percent[i] + "	" + grade[i]);
        }
        in.close();
    }
}
