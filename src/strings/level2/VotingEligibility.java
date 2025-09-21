package strings.level2;

import java.util.Scanner;

public class VotingEligibility {
    public static int[] generateAges(int n){
        int[] ages = new int[n];
        for(int i=0;i<n;i++){
            ages[i] = 10 + (int)(Math.random()*90); // random 10-99
        }
        return ages;
    }

    public static String[][] canVote(int[] ages){
        String[][] res = new String[ages.length][2];
        for(int i=0;i<ages.length;i++){
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = (ages[i]>=18) ? "true" : "false";
        }
        return res;
    }

    public static void display(String[][] arr){
        System.out.println("Age\tCan Vote?");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args){
        int[] ages = generateAges(10);
        String[][] result = canVote(ages);
        display(result);
    }
}
