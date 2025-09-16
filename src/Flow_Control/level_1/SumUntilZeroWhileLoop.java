package Flow_Control.level_1;

import java.util.Scanner;

public class SumUntilZeroWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
            if (number == 0) {
                break;
            }
            total += number;
        }

        System.out.println("Sum of numbers = " + total);
        sc.close();
    }
}

