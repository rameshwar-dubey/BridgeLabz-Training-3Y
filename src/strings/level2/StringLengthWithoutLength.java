package strings.level2;

import java.util.Scanner;

public class StringLengthWithoutLength {
    public static int getStringLength(String s) {
        int count = 0;
        try {
            while(true) {
                s.charAt(count);
                count++;
            }
        } catch(IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int len1 = getStringLength(text);
        int len2 = text.length();

        System.out.println("Length using custom method: " + len1);
        System.out.println("Length using built-in length(): " + len2);
    }
}
