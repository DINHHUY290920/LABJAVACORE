/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0074;

import java.util.Scanner;

/**
 *
 * @author dinhh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        DataInput in = new DataInput();
        Matrix m = new Matrix();
        int[][] matrix1;
        int[][] matrix2;
        int[][] matrixResult;

        boolean isStop = false;
        while (!isStop) {
            main.menu();
            int choice = in.inputChoice(1, 4);
            switch (choice) {
                case 1: {
                    System.out.println("--------Addition--------");
                    matrix1 = main.inputMatrix(1);
                    System.out.println("");
                    matrix2 = main.inputMatrix(2);
                    System.out.println("--------Result--------");

                    matrixResult = m.additionMatrix(matrix1, matrix2);

                    if (matrixResult == null) {
                        System.out.println("Can't Addition Matrix");
                        break;
                    }

                    main.displayMatrix(matrix1);
                    System.out.println("+");
                    main.displayMatrix(matrix2);
                    System.out.println("=");
                    main.displayMatrix(matrixResult);
                    break;
                }
                case 2: {
                    System.out.println("--------Subtraction--------");
                    matrix1 = main.inputMatrix(1);
                    System.out.println("");
                    matrix2 = main.inputMatrix(2);
                    System.out.println("--------Result--------");

                    matrixResult = m.subtractionMatrix(matrix1, matrix2);

                    if (matrixResult == null) {
                        System.out.println("Can't Subtraction Matrix");
                        break;
                    }

                    main.displayMatrix(matrix1);
                    System.out.println("-");
                    main.displayMatrix(matrix2);
                    System.out.println("=");
                    main.displayMatrix(matrixResult);
                    break;
                }
                case 3: {
                    System.out.println("--------Multiplication--------");
                    matrix1 = main.inputMatrix(1);
                    System.out.println("");
                    matrix2 = main.inputMatrix(2);
                    System.out.println("--------Result--------");

                    matrixResult = m.multiplicationMatrix(matrix1, matrix2);

                    if (matrixResult == null) {
                        System.out.println("Can't Multiplication Matrix");
                        break;
                    }

                    main.displayMatrix(matrix1);
                    System.out.println("*");
                    main.displayMatrix(matrix2);
                    System.out.println("=");
                    main.displayMatrix(matrixResult);
                    break;
                }
                case 4: {
                    isStop = true;
                    break;
                }
            }
        }
    }

    private void menu() {
        System.out.println("=======Calculator program=======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        System.out.print("Your choice: ");
    }
    public void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

    public int[][] inputMatrix(int n) {
        DataInput in = new DataInput();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Row Matrix" + n + ": ");
        int row = in.inputSize();
        System.out.print("Enter Colum Matrix" + n + ": ");
        int col = in.inputSize();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Matrix" + n + "[" + (i + 1) + "]" + "[" + (j + 1) + "]: ");
                matrix[i][j] = in.inputInt();
            }
        }
        return matrix;
    }
}
