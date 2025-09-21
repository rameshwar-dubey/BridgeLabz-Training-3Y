package array.level2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        int[] frequency = new int[10];
        long temp = num;

        while (temp != 0) {
            int digit = (int)(temp % 10);
            frequency[digit]++;
            temp /= 10;
        }

        System.out.println("Digit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0)
                System.out.println(i + "\t" + frequency[i]);
        }
    }
}
