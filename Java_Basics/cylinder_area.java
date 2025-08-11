import java.util.*;

public class cylinder_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        System.out.println("Enter the height");
        int height = sc.nextInt();
        System.out.println("Area of the Cylinder is "+ (Math.PI*Math.pow(radius, 2)*height));
    }
}

