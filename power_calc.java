import java.util.*;

public class power_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Etner the base number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the power: ");
        int num2 = sc.nextInt();
        System.out.println("Result "+ Math.pow(num1,num2));
    }
    
}
