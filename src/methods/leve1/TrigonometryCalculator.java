package methods.leve1;

import java.util.Scanner;

public class TrigonometryCalculator {

    public static void calculateTrigonometricFunctions(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees);
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        System.out.printf("Sine(%.2f°) = %.4f%n", angleInDegrees, sine);
        System.out.printf("Cosine(%.2f°) = %.4f%n", angleInDegrees, cosine);
        System.out.printf("Tangent(%.2f°) = %.4f%n", angleInDegrees, tangent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        calculateTrigonometricFunctions(angle);

    }
}

