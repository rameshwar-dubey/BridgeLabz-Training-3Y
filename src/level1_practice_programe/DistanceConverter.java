package level1_practice_programe;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();
        double yards = distanceInFeet / 3.0;
        double miles = yards / 1760.0;
        System.out.printf("The distance is %.2f feet, which is %.2f yards or %.4f miles.\n",
                distanceInFeet, yards, miles);
    }
}

