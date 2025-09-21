package array.level2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // weight, height, BMI
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Invalid weight, enter positive value.");
                    continue;
                }
                break;
            }
            while (true) {
                System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Invalid height, enter positive value.");
                    continue;
                }
                break;
            }

            double heightInMeters = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);

            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25) weightStatus[i] = "Normal";
            else if (personData[i][2] < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nPerson\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}

