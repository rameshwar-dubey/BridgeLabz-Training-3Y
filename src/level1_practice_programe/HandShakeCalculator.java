package level1_practice_programe;

import java.util.Scanner;

public class HandShakeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.printf("The maximum number of possible handshakes among %d students is %d\n",
                numberOfStudents, handshakes);
    }
}

