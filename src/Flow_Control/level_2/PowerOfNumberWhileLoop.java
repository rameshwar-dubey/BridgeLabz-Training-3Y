package Flow_Control.level_2;

import java.util.Scanner;

public class PowerOfNumberWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        if (power < 0) {
            System.out.println("Invalid input! Please enter a non-negative integer for power.");
        } else {
            int result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(number + " raised to the power " + power + " = " + result);
        }

        sc.close();
    }
}
