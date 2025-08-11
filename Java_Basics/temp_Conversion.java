import java.util.*;

public class temp_Conversion {
    public static void main(String[] args) {
        System.out.print("Enter the temperatur in Celsius: ");
        int temp_cel = new Scanner(System.in).nextInt(); 
        System.out.println("Temperature in Fahrenheit is " + ((temp_cel*1.8) + 32));
    }    
}
