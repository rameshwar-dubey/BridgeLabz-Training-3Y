package methods.level3;

import java.util.*;

public class ZaraBonus {

    public static double[][] generateEmployeeData(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + Math.random() * 90000;
            data[i][1] = 1 + (int)(Math.random() * 10);
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] newData = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            double years = data[i][1];
            double bonus = (years > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;
            newData[i][0] = oldSalary;
            newData[i][1] = bonus;
            newData[i][2] = newSalary;
        }
        return newData;
    }

    public static void displaySummary(double[][] data) {
        double sumOld = 0, sumBonus = 0, sumNew = 0;
        System.out.printf("%-10s %-12s %-10s %-12s\n", "Employee", "Old Salary", "Bonus", "New Salary");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10d %-12.2f %-10.2f %-12.2f\n", i+1, data[i][0], data[i][1], data[i][2]);
            sumOld += data[i][0];
            sumBonus += data[i][1];
            sumNew += data[i][2];
        }
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-10.2f %-12.2f\n", "Total", sumOld, sumBonus, sumNew);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees);
        double[][] bonusData = calculateBonus(employeeData);
        displaySummary(bonusData);
    }
}
