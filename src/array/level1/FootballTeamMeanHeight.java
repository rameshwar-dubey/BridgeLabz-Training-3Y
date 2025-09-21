package array.level1;

import java.util.Scanner;

public class FootballTeamMeanHeight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11]; // 11 players
        System.out.println("Enter the height of 11 players in cm:");

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        double totalHeight = calculateSum(heights);
        double meanHeight = totalHeight / heights.length;

        System.out.println("\nTotal Height of Team: " + totalHeight + " cm");
        System.out.println("Mean Height of Team: " + meanHeight + " cm");
    }

    public static double calculateSum(double[] arr) {
        double sum = 0;
        for (double height : arr) {
            sum += height;
        }
        return sum;
    }
}

