package Flow_Control.level_2;
import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            int i = 1;  // counter
            while (i <= number) {  // include the number itself
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

        sc.close();
    }
}
