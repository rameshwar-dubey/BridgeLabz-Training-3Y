package Flow_Control.level_1;

import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting countdown number: ");
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Lift Off 🚀");

        sc.close();
    }
}

