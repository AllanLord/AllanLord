import java.util.Scanner;

public class MathOperations {

    static void getCoFactor(int matrix[][], int temp[][], int p, int q, int n) {
        int i = 0;
        int j = 0;

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {

                if (row != p && column != q) {
                    temp[i][j++] = matrix[row][column];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }

        }

    }// ENDS COFACTOR

    static int determinantMatrix(int matrix[][], int n) {
        int Determinant = 0;

        if (n == 1) {
            return matrix[0][0];

        }
        int temp[][] = new int[n][n];
        int multiplier = 1;

        for (int f = 0; f < n; f++) {
            getCoFactor(matrix, temp, 0, f, n);
            Determinant += multiplier * (matrix[0][f]) * determinantMatrix(temp, n - 1);
            multiplier = -multiplier;

        }
        return Determinant;

    }

    // RESOLUCION DE SISTEMA DE ECUACIONES GRADO "N"

    static void equationSystem() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of Unknowns: ");
        int unkn = scan.nextInt();

        int system[][] = new int[unkn][unkn + 1];
        System.out.println("Start enter the coefficients: ");

        for (int i = 0; i < unkn; i++) {
            System.out.println("Equation: " + (i + 1));

            for (int j = 0; j <= unkn; j++) {

                if (j == unkn) {
                    System.out.println("R" + (i + 1) + ":\t");

                } else {
                    System.out.println("X" + (j + 1) + ":\t");
                }

                system[i][j] = scan.nextInt();
            }
        } // END FOR'S LOOPS

        int M[][] = new int[unkn][unkn];
        int R[] = new int[unkn];

        for (int i = 0; i < unkn; i++) {
            for (int j = 0; j < unkn; j++) {
                M[i][j] = system[i][j];
            }
        }

        for (int i = 0; i < unkn; i++) {
            for (int j = 0; j <= unkn; j++) {
                if (j == unkn) {
                    R[i] = system[i][j];
                }
            }
        }

        int equis[] = new int[unkn];
        int counting = 0;
        int temp[][] = new int[unkn][unkn];

        while (counting < unkn) {
            for (int i = 0; i < unkn; i++) {
                for (int j = 0; j < unkn; j++) {
                    if (j == counting) {
                        temp[i][j] = R[i];
                    } else {
                        temp[i][j] = M[i][j];
                    }

                }
            } // ENDS FOR LOOPS

            equis[counting] = determinantMatrix(temp, unkn);
            counting++;

        } // ENDS WHILE LOOP

        double results[] = new double[unkn];
        double D = determinantMatrix(M, unkn);

        System.out.println("Results");

        for (int i = 0; i < unkn; i++) {
            double dx = equis[i];
            results[i] = dx / D;

            System.out.println("X[" + i + "]:\t" + results[i]);
        }
        // scan.close();

    }

}
