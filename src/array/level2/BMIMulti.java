package array.level2;

import java.util.Scanner;

public class BMIMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Invalid weight, enter again.");
                    continue;
                }
                break;
            }

            while (true) {
                System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Invalid height, enter again.");
                    continue;
                }
                break;
            }

            double heightM = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightM * heightM);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 25) status[i] = "Normal";
            else if (personData[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nPerson\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], status[i]);
        }
    }
}

