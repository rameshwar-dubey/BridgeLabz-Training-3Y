package strings.level1;

import java.util.Scanner;

public class ToUppercase {
    public static String toUpperCharAt(String s) {
        String res = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z') c -= 32;
            res += c;
        }
        return res;
    }

    public static boolean compareStrings(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++) if(s1.charAt(i)!=s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String upper1 = toUpperCharAt(text);
        String upper2 = text.toUpperCase();
        System.out.println("Uppercase charAt(): " + upper1);
        System.out.println("Uppercase built-in: " + upper2);
        System.out.println("Comparison: " + compareStrings(upper1, upper2));
    }
}
