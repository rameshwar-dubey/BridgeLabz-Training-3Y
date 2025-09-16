package Flow_Control.level_2;

import java.util.Scanner;

public class EmployeeBonus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = 0.05 * salary;   // 5% bonus
            System.out.println("Bonus Amount = " + bonus);
        } else {
            System.out.println("No Bonus! Employee must have more than 5 years of service.");
        }

        sc.close();
    }
}

