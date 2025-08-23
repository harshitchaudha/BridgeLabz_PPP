import java.util.*;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int N = 10;
        double[] salary = new double[N];
        int[] years = new int[N];
        double[] bonus = new double[N];
        double[] newSalary = new double[N];

        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < N; i++) {
            while (true) {
                System.out.print("Enter salary of employee " + (i+1) + ": ");
                salary[i] = in.nextDouble();
                System.out.print("Enter years of service of employee " + (i+1) + ": ");
                years[i] = in.nextInt();
                if (salary[i] > 0 && years[i] >= 0) break;
                System.out.println("Invalid input. Please re-enter.");
            }
        }

        for (int i = 0; i < N; i++) {
            if (years[i] > 5) bonus[i] = 0.05 * salary[i];
            else bonus[i] = 0.02 * salary[i];
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("Total old salary: " + totalOld);
        System.out.println("Total bonus: " + totalBonus);
        System.out.println("Total new salary: " + totalNew);
        in.close();
    }
}
