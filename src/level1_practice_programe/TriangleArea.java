package level1_practice_programe;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        System.out.printf("The area of a triangle with base %.2f in and height %.2f in is %.2f square inches (%.2f square cm)\n",
                base, height, areaInInches, areaInCm);
    }
}

