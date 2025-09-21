package strings.level1;

import java.util.Scanner;

public class ArrayIndex {
    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        System.out.print("Enter 3 names: ");
        for(int i=0;i<3;i++) arr[i] = sc.next();
        handleException(arr);
    }
}

