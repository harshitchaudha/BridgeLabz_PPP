import java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second Integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third Integer: ");
        int num3 = sc.nextInt();
        System.out.println("The average of the three numbers are: "+ ((num1 +num2+ num3)/3));
    }    
}
