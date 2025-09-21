package strings.level2;

import java.util.Scanner;

public class VowelConsonentCount {
    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }

    public static int[] countVowelsConsonants(String text){
        int vowels=0, consonants=0;
        for(int i=0;i<text.length();i++){
            char c = text.charAt(i);
            if(Character.isLetter(c)){
                if(isVowel(c)) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] result = countVowelsConsonants(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
