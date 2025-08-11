import java.util.*;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the Simple Interest Calculator!");
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the annual interest rate (in percent): ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double time = sc.nextDouble();
        System.out.print("Calculated Simple Interest: " + ((principal * rate * time) / 100));
    }
}
