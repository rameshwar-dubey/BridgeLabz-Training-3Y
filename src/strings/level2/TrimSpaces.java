package strings.level2;

import java.util.Scanner;

public class TrimSpaces {
    public static int[] findTrimIndexes(String text){
        int start=0, end=text.length()-1;
        while(start<=end && text.charAt(start)==' ') start++;
        while(end>=start && text.charAt(end)==' ') end--;
        return new int[]{start,end};
    }

    public static String substringCharAt(String s, int start, int end){
        String result = "";
        for(int i=start;i<=end;i++) result += s.charAt(i);
        return result;
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

        int[] indexes = findTrimIndexes(text);
        String trimmedCustom = substringCharAt(text, indexes[0], indexes[1]);
        String trimmedBuiltIn = text.trim();

        System.out.println("Custom trimmed: '" + trimmedCustom + "'");
        System.out.println("Built-in trimmed: '" + trimmedBuiltIn + "'");
        System.out.println("Comparison: " + compareStrings(trimmedCustom, trimmedBuiltIn));
    }
}
