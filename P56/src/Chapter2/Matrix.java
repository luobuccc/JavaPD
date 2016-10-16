package Chapter2;

import java.util.Arrays;

/**
 * Created by PuFan on 2016/10/12.
 */
public class Matrix {
    /**
     * @noinspection Since15
     */
    static public void Print(int[][] src) {
        for (int i = 0; i < src.length; ++i) {
            System.out.println(Arrays.toString(src[i]));
        }
    }

    static public void MatrixConversion(int[][] a) {
        int a_result[][] = new int[a[0].length][];
        for (int i = 0; i < a[0].length; ++i)
            a_result[i] = new int[a.length];
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[0].length; ++j)
                a_result[j][i] = a[i][j];
        System.out.println("矩阵转置：");
        Print(a_result);
    }

    static public void MatrixMultiply(int[][] a, int[][] b) {
        int result[][] = new int[a.length][];
        for (int i = 0; i < a.length; ++i)
            result[i] = new int[b[0].length];
        int sum = 0;
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < b[i].length; ++j) {
                for (int k = 0; k < a[i].length; ++k)
                    sum += a[i][k] * b[k][j];
                result[i][j] = sum;
                sum = 0;
            }
        }
        System.out.println("矩阵相乘：");
        Print(result);
    }

    static public void main(String[] args) {
        final int a[][] = {
                {5, 7, 8, 2},
                {-2, 4, 1, 2},
                {1, 2, 3, 4}}; //a转置输出
        final int b[][] = {
                {4, -2, 3, 3, 9},
                {4, 3, 8, 1, -2},
                {2, 3, 5, 2, 7},
                {1, 0, 6, 3, 4}};  //计算ab相乘
        MatrixConversion(a);
        MatrixMultiply(a, b);
    }
}

