package strings.level1;

import java.util.Scanner;

public class CharArrayComparison {
    public static char[] getChars(String s) {
        char[] arr = new char[s.length()];
        for(int i=0; i<s.length(); i++) arr[i] = s.charAt(i);
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if(a.length != b.length) return false;
        for(int i=0; i<a.length; i++) if(a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();

        char[] arr1 = getChars(text);
        char[] arr2 = text.toCharArray();

        System.out.println("Arrays equal: " + compareArrays(arr1, arr2));
    }
}

