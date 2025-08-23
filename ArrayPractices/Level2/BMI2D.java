import java.util.*;

public class BMI2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = in.nextInt();

        double[][] personData = new double[n][3]; // weight, height, BMI
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            personData[i][0] = in.nextDouble();
            System.out.print("Enter height (m) of person " + (i+1) + ": ");
            personData[i][1] = in.nextDouble();
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25) weightStatus[i] = "Normal";
            else if (personData[i][2] < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("Height	Weight	BMI	Status");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][1] + "	" + personData[i][0] + "	" + personData[i][2] + "	" + weightStatus[i]);
        }
        in.close();
    }
}
