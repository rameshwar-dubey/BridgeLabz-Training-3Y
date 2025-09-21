package strings.level2;
import java.util.Scanner;

public class WordsWithLength {
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

    public static String[][] wordsAndLengths(String[] words){
        String[][] res = new String[words.length][2];
        for(int i=0;i<words.length;i++){
            res[i][0] = words[i];
            res[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitCharAt(text);
        String[][] data = wordsAndLengths(words);

        System.out.println("Word\tLength");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0] + "\t" + Integer.parseInt(data[i][1]));
        }
    }
}

