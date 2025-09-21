package strings.level2;

import java.util.Scanner;

public class ShortestLongestWord {
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

    public static int getStringLength(String s){
        int count=0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        } catch(IndexOutOfBoundsException e){
            return count;
        }
    }

    public static String[] findShortestLongest(String[] words){
        String shortest=words[0], longest=words[0];
        for(String w: words){
            if(getStringLength(w)<getStringLength(shortest)) shortest=w;
            if(getStringLength(w)>getStringLength(longest)) longest=w;
        }
        return new String[]{shortest,longest};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitCharAt(text);
        String[] result = findShortestLongest(words);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
