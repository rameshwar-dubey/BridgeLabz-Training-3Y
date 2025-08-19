package level2_practice_programe;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f\n",
                result1, result2, result3, result4);
    }
}

