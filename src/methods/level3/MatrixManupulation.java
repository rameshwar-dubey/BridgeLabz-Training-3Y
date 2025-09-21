package methods.level3;

import java.util.*;

public class MatrixManupulation {

    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }
        return matrix;
    }

    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] trans = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    public static double determinant2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if(det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1]/det;
        inv[0][1] = -m[0][1]/det;
        inv[1][0] = -m[1][0]/det;
        inv[1][1] = m[0][0]/det;
        return inv;
    }

    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if(det == 0) return null;
        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2]-m[1][2]*m[2][1])/det;
        inv[0][1] = -(m[0][1]*m[2][2]-m[0][2]*m[2][1])/det;
        inv[0][2] =  (m[0][1]*m[1][2]-m[0][2]*m[1][1])/det;

        inv[1][0] = -(m[1][0]*m[2][2]-m[1][2]*m[2][0])/det;
        inv[1][1] =  (m[0][0]*m[2][2]-m[0][2]*m[2][0])/det;
        inv[1][2] = -(m[0][0]*m[1][2]-m[0][2]*m[1][0])/det;

        inv[2][0] =  (m[1][0]*m[2][1]-m[1][1]*m[2][0])/det;
        inv[2][1] = -(m[0][0]*m[2][1]-m[0][1]*m[2][0])/det;
        inv[2][2] =  (m[0][0]*m[1][1]-m[0][1]*m[1][0])/det;

        return inv;
    }

    public static void displayMatrix(double[][] m) {
        for (double[] row : m) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();
        double[][] matrix = createRandomMatrix(n, n);

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        if(n == 2) {
            System.out.printf("\nDeterminant: %.2f\n", determinant2x2(matrix));
            double[][] inv = inverse2x2(matrix);
            System.out.println("\nInverse:");
            if(inv != null) displayMatrix(inv);
            else System.out.println("Matrix is singular (no inverse).");
        } else if(n == 3) {
            System.out.printf("\nDeterminant: %.2f\n", determinant3x3(matrix));
            double[][] inv = inverse3x3(matrix);
            System.out.println("\nInverse:");
            if(inv != null) displayMatrix(inv);
            else System.out.println("Matrix is singular (no inverse).");
        } else {
            System.out.println("Only 2x2 or 3x3 matrices are supported.");
        }
    }
}
