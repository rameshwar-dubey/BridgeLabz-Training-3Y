package methods.level3;

import java.util.*;

public class FootballTeamHeights {

    public int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101);
        }
        return heights;
    }

    public int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    public int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    public int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FootballTeamHeights fth = new FootballTeamHeights();

        int[] heights = fth.generateHeights(11);
        System.out.println("Players' Heights (in cm): " + Arrays.toString(heights));

        double mean = fth.findMean(heights);
        int shortest = fth.findShortest(heights);
        int tallest = fth.findTallest(heights);

        System.out.printf("Mean Height: %.2f cm%n", mean);
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}
