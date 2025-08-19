package level2_practice_programe;

import java.util.Scanner;

public class Squareside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);
    }
}

