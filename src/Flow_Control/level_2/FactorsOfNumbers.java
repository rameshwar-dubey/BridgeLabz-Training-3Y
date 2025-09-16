package Flow_Control.level_2;

import java.util.Scanner;

public class FactorsOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {  // i <= number to include the number itself
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}

