package methods.leve1;

import java.util.Scanner;

public class TRinagularParkRun {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a of the triangular park (in meters): ");
        double a = sc.nextDouble();

        System.out.print("Enter side b of the triangular park (in meters): ");
        double b = sc.nextDouble();

        System.out.print("Enter side c of the triangular park (in meters): ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);

        System.out.println("The athlete must complete " + rounds +
                " rounds of the triangular park to finish a 5 km run.");

    }
}

