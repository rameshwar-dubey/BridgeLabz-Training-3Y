package strings.level1;

import java.util.Scanner;

public class StringIndex {
    public static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();
        handleException(text);
    }
}
