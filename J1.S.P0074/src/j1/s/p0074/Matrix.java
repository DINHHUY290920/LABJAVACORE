package j1.s.p0074;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vu Duc Tien
 */
public class Matrix {

    public Matrix() {
    }

    
    // thì đây nó thực hiện phép cộng matrix thôi, có phép cộng với phếp trừ t ghi 2 cái yêu cầu chủ yếu đáy
    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        //check số lượng cột vào số lượng hàng của matrix phải băng nhau
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return null;
        }

        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] matrixResult = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixResult;
    }

    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        //check số lượng cột vào số lượng hàng của matrix phải băng nhau
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return null;
        }

        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] matrixResult = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixResult[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrixResult;
    }

    public int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        //Phép nhân matrix thì nó khác nó có điều kiện số lượng hàng của matrix 1 phải bằng số lượng cột của matrix 2.
        //b nói số lượng hoặc độ dài nha, t hơi loạn 2 từ đấy trong bài matrix này, vì nó liên quan mảng 2 chiều
        if (matrix1.length != matrix2[0].length) {
            return null;
        }

        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int col2 = matrix2[0].length;

        int[][] matrixResult = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                matrixResult[i][j] = 0;
            }
        }
        for (int i = 0; i < row1; i++) {  // chạy từng phần tử trong hàng của matrix 1
            for (int j = 0; j < col2; j++) { // chạy từng phần tử của trong cột của matrix 2
                for (int k = 0; k < col1; k++) { // chạy từng phần tử trong cột của matrix 1
                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j]; // tổng (từng phần tử trong hàng của m1 x từng phần tử trong cột của m2)
                }
            }
        }
        return matrixResult;
    }
}
