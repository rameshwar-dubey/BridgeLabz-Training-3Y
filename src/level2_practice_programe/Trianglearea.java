package level2_practice_programe;

import java.util.Scanner;

public class Trianglearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n",
                areaInches, areaCm);
    }
}

