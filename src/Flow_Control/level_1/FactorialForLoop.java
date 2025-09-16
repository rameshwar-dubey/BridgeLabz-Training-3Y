package Flow_Control.level_1;

import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid input! Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;  // long to handle large results

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + n + " = " + factorial);
        }

        sc.close();
    }
}

