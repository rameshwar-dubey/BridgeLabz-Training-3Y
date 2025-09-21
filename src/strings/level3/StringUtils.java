package strings.level3;

import java.util.Scanner;

public class StringUtils {

    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] unique = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[index++] = ch;
        }
        char[] result = new char[index];
        System.arraycopy(unique, 0, result, 0, index);
        return result;
    }

    public static char firstNonRepeatingChar(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
        return '\0';
    }

    public static String[][] frequencyOfChars(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        int count = 0;
        for (int i = 0; i < 256; i++) if (freq[i] > 0) count++;
        String[][] result = new String[count][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[idx][0] = String.valueOf((char)i);
                result[idx][1] = String.valueOf(freq[i]);
                idx++;
            }
        }
        return result;
    }

    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i)]++;
            freq2[str2.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) if (freq1[i] != freq2[i]) return false;
        return true;
    }

    public static void display2DArray(String[][] arr) {
        for (String[] row : arr) {
            System.out.println(row[0] + " : " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] unique = uniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
        System.out.println();

        char firstNonRepeat = firstNonRepeatingChar(text);
        System.out.println("First non-repeating character: " + firstNonRepeat);

        System.out.println("Character frequencies:");
        String[][] freqArr = frequencyOfChars(text);
        display2DArray(freqArr);

        System.out.println("Is palindrome? " + isPalindrome(text));

        System.out.print("Enter another string to check anagram: ");
        String text2 = sc.nextLine();
        System.out.println("Are anagrams? " + areAnagrams(text, text2));
    }
}
