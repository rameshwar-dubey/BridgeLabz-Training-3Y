package strings.level1;

import java.util.Scanner;

public class ToLowerCase{
    public static String toLowerCharAt(String s) {
        String res = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z') c += 32;
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
        String lower1 = toLowerCharAt(text);
        String lower2 = text.toLowerCase();
        System.out.println("Lowercase charAt(): " + lower1);
        System.out.println("Lowercase built-in: " + lower2);
        System.out.println("Comparison: " + compareStrings(lower1, lower2));
    }
}
