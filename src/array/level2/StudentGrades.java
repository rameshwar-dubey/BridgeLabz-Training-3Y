package array.level2;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                while (true) {
                    System.out.print("Enter marks (0-100): ");
                    marks[i][j] = sc.nextDouble();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid marks, enter again.");
                        continue;
                    }
                    break;
                }
            }

            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentages[i] >= 90) grades[i] = "A+";
            else if (percentages[i] >= 80) grades[i] = "A";
            else if (percentages[i] >= 70) grades[i] = "B+";
            else if (percentages[i] >= 60) grades[i] = "B";
            else if (percentages[i] >= 50) grades[i] = "C";
            else grades[i] = "F";
        }

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%.2f\t\t%s\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}

