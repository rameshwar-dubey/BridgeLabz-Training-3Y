package strings.level2;

import java.util.Scanner;

public class SplitTextWithoutSplit {
    public static String[] splitCharAt(String text) {
        int wordCount = 1;
        for(int i=0;i<text.length();i++) if(text.charAt(i)==' ') wordCount++;
        String[] words = new String[wordCount];
        int start=0, index=0;
        for(int i=0;i<=text.length();i++){
            if(i==text.length() || text.charAt(i)==' '){
                words[index++] = text.substring(start,i);
                start = i+1;
            }
        }
        return words;
    }

    public static boolean compareStringArrays(String[] a, String[] b){
        if(a.length != b.length) return false;
        for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words1 = splitCharAt(text);
        String[] words2 = text.split(" ");

        System.out.println("Custom split:");
        for(String w: words1) System.out.print(w + "| ");
        System.out.println("\nBuilt-in split:");
        for(String w: words2) System.out.print(w + "| ");
        System.out.println("\nComparison result: " + compareStringArrays(words1, words2));
    }
}

