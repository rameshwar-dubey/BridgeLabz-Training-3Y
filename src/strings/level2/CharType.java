package strings.level2;

import java.util.Scanner;

public class CharType {
    public static String getCharType(char c){
        if(!Character.isLetter(c)) return "Not a Letter";
        c = Character.toLowerCase(c);
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') ? "Vowel" : "Consonant";
    }

    public static String[][] charTypes(String text){
        String[][] result = new String[text.length()][2];
        for(int i=0;i<text.length();i++){
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = getCharType(text.charAt(i));
        }
        return result;
    }

    public static void display2D(String[][] arr){
        System.out.println("Char\tType");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = charTypes(text);
        display2D(result);
    }
}
