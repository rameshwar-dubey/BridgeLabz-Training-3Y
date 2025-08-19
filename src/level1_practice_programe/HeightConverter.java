package level1_practice_programe;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightCm = sc.nextDouble();
        double totalInches = heightCm / 2.54;
        double feet = totalInches / 12;
        double inches = totalInches % 12;
        System.out.printf("Your height in cm is %.2f while in feet is %.2f and inches is %.2f\n",
                heightCm, feet, inches);
    }
}

