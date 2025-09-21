package array.level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[] salary = new double[n];
        double[] years = new double[n];
        double[] newSalary = new double[n];
        double[] bonus = new double[n];

        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            while (true) {
                System.out.print("Enter salary: ");
                salary[i] = sc.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("Invalid salary. Enter again.");
                    continue;
                }
                break;
            }
            while (true) {
                System.out.print("Enter years of service: ");
                years[i] = sc.nextDouble();
                if (years[i] < 0) {
                    System.out.println("Invalid years of service. Enter again.");
                    continue;
                }
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (years[i] > 5) bonus[i] = salary[i] * 0.05;
            else bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }

        System.out.println("\nEmployee\tSalary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t\t%.2f\t%.1f\t%.2f\t%.2f\n",
                    i + 1, salary[i], years[i], bonus[i], newSalary[i]);
        }
        System.out.printf("\nTotal Old Salary: %.2f\nTotal Bonus: %.2f\nTotal New Salary: %.2f\n",
                totalOldSalary, totalBonus, totalNewSalary);
    }
}

