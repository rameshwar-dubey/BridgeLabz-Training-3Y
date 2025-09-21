package array.level2;

import java.util.Scanner;
import java.util.Arrays;

public class DynamicalLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        long temp = number;

        while (temp != 0) {
            if (index == maxDigit) {
                maxDigit *= 2;
                digits = Arrays.copyOf(digits, maxDigit);
            }
            digits[index++] = (int)(temp % 10);
            temp /= 10;
        }

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
    }
}

