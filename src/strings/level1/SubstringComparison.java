package strings.level1;

import java.util.*;

public class SubstringComparison {
    public static String substringCharAt(String s, int start, int end) {
        String sub = "";
        for(int i=start; i<end; i++) sub += s.charAt(i);
        return sub;
    }

    public static boolean compareCharAt(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        for(int i=0; i<s1.length(); i++) if(s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = substringCharAt(text, start, end);
        String sub2 = text.substring(start, end);

        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);
        System.out.println("Comparison: " + compareCharAt(sub1, sub2));
    }
}
