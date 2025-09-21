package strings.level2;
import java.util.Scanner;

public class StudentGrades {

    public static int[][] generateScores(int n){
        int[][] scores = new int[n][3];
        for(int i=0;i<n;i++){
            scores[i][0] = 10 + (int)(Math.random()*90); // Physics
            scores[i][1] = 10 + (int)(Math.random()*90); // Chemistry
            scores[i][2] = 10 + (int)(Math.random()*90); // Maths
        }
        return scores;
    }

    public static double[][] calculateTotalAveragePercentage(int[][] scores){
        int n = scores.length;
        double[][] res = new double[n][3]; // total, average, percentage
        for(int i=0;i<n;i++){
            int total = scores[i][0]+scores[i][1]+scores[i][2];
            double average = Math.round((total/3.0)*100.0)/100.0;
            double percentage = Math.round((total/300.0*100.0)*100.0)/100.0;
            res[i][0] = total;
            res[i][1] = average;
            res[i][2] = percentage;
        }
        return res;
    }

    public static String[] calculateGrade(double[][] percentages){
        String[] grades = new String[percentages.length];
        for(int i=0;i<percentages.length;i++){
            double perc = percentages[i][2];
            if(perc>=90) grades[i] = "A+";
            else if(perc>=80) grades[i] = "A";
            else if(perc>=70) grades[i] = "B+";
            else if(perc>=60) grades[i] = "B";
            else if(perc>=50) grades[i] = "C";
            else if(perc>=40) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] totalAvgPerc, String[] grades){
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for(int i=0;i<scores.length;i++){
            System.out.print((i+1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print((int)totalAvgPerc[i][0] + "\t" + totalAvgPerc[i][1] + "\t" + totalAvgPerc[i][2] + "\t" + grades[i]);
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] totalAvgPerc = calculateTotalAveragePercentage(scores);
        String[] grades = calculateGrade(totalAvgPerc);
        displayScorecard(scores, totalAvgPerc, grades);
    }
}
