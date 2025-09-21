package strings.level1;

import java.util.Scanner;

public class NumberFormat{
    public static void handleException(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to parse as integer: ");
        String text = sc.nextLine();
        handleException(text);
    }
}
