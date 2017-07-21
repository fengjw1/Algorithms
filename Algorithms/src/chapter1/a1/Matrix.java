package chapter1.a1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/21.
 */
public class Matrix {
    public static double dot(double[] x, double[] y){ //向量点乘
        double result = 0;
        if(x.length == y.length){
            for (int i = 0; i < x.length; i ++)
                result += x[i] * y[i]; //不用加括号，优先级是不一样的
        }else {
            StdOut.println("Error!");
            return result;
        }
        return result;
    }

    public static double[][] mult(double[][] a, double[][] b){ //矩阵与矩阵之积  [M][N] * [N][P] = [M][P]
            if (a[0].length == b.length){
                double[][] result = new double[a.length][b[0].length];//第一个是行，第二个是列
            for(int i = 0; i < result.length; i ++)
                for (int j = 0; j < result[i].length; j ++)
                    for (int k = 0; k < b.length; k ++) //这里b.length 可以换为 a[0].length
                        result[i][j] += a[i][k] * b[k][j];
            return result;
        }else {
            StdOut.println("Error!!!");
            return null;
        }
    }

    public static double[][] transpose(double[][] a){ //转置矩阵
        double[][] result = new double[a[0].length][a.length];
        for(int i = 0; i < a.length; i ++){
            for (int j = 0; j < a[0].length; j ++){
                result[i][j] = a[j][i];
            }
        }
        return result;
    }

    public static double[] mult(double[] y,double[][] x){ //向量和矩阵之积
        double[] result = new double[x.length];
        if(x[0].length == y.length){
            for (int i = 0; i < x.length; i ++){
                for (int j = 0; j < y.length; j ++){
                    result[i] += x[i][j] * y[j];
                }
            }
        }else {
            StdOut.println("Error!");
            return null;
        }
        return result;
    }

//    public static double[] mult(double[][] a, double[] y){ //
//        double[][] result = new double[a.length][a[0].length]
//    }
}
