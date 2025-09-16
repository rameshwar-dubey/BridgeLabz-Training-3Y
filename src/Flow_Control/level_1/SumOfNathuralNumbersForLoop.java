package Flow_Control.level_1;
import java.util.*;

public class SumOfNathuralNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (greater than 0).");
        } else {
            // Using formula
            int formulaSum = n * (n + 1) / 2;

            // Using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Print results
            System.out.println("Sum using formula: " + formulaSum);

        }
    }
}
