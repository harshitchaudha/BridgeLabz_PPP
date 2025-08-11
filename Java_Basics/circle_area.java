// package BridgeLabz_PPP.Java_Basics;
import java.util.*;

public class circle_area {
    public static void main(String[] args) {
        System.out.print("Enter the Radius of the circle: ");
        double radius = new Scanner(System.in).nextInt();
        System.out.println("Area of the Circle is "+ (Math.PI*(Math.pow(radius, 2))));
    }
}
