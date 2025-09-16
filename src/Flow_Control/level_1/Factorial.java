package Flow_Control.level_1;
import java.util.Scanner;
public class Factorial {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Invalid input! Factorial is not defined for negative numbers.");
            } else {
                long factorial = 1;
                int i = 1;
                while (i <= n) {
                    factorial *= i;
                    i++;
                }

                System.out.println("Factorial of " + n + " = " + factorial);
            }

            sc.close();
        }
}


