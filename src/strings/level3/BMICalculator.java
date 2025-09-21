package strings.level3;

import java.util.Scanner;

public class BMICalculator {

    public static String[][] calculateBMI(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for(int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double heightM = hw[i][1] / 100.0; // convert cm to meters
            double bmi = Math.round((weight / (heightM * heightM)) * 100.0) / 100.0;
            String status;
            if(bmi < 18.5) status = "Underweight";
            else if(bmi <= 24.9) status = "Normal";
            else if(bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(hw[i][1]);
            result[i][1] = String.valueOf(hw[i][0]);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void displayBMI(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data[i].length; j++){
                System.out.print(data[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2]; // 10 persons: 0-height, 1-weight

        for(int i=0; i<10; i++){
            System.out.print("Enter height(cm) of person " + (i+1) + ": ");
            hw[i][1] = sc.nextDouble();
            System.out.print("Enter weight(kg) of person " + (i+1) + ": ");
            hw[i][0] = sc.nextDouble();
        }

        String[][] bmiData = calculateBMI(hw);
        displayBMI(bmiData);
    }
}
