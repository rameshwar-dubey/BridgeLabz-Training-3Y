package level2_practice_programe;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d\n",
                quotient, remainder, number1, number2);
    }
}

