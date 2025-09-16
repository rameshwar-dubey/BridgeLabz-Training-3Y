package Flow_Control.level_1;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = 0.05 * salary;  // 5% bonus
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No bonus! Years of service must be more than 5.");
        }

        sc.close();
    }
}

