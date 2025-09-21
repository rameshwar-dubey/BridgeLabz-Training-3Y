package methods.leve2;

import java.util.Scanner;

public class SumNaturalNumbersrecursive {

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number greater than 0.");
        } else {
            int sumRec = sumRecursive(n);
            int sumFor = sumFormula(n);

            System.out.println("Sum using recursion: " + sumRec);
            System.out.println("Sum using formula: " + sumFor);

            if (sumRec == sumFor) {
                System.out.println("Both results are equal and correct.");
            } else {
                System.out.println("There is a discrepancy in the calculations!");
            }
        }

    }
}

