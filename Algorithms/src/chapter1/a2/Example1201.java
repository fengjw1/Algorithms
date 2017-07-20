package chapter1.a2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/20.
 */
public class Example1201 {
    public static void main(String [] args){
        int N = StdIn.readInt();
        //StdOut.println("N = " + N);
        Point2D[] point2D = new Point2D[N];
        for(int i = 0; i < N; i ++){
            point2D[i] = new Point2D(Math.random(),Math.random());
            point2D[i].draw();
        }

        if(N > 1){
            double min = point2D[0].distanceTo(point2D[1]); //设置最大值为默认最小值的初始值
            for (int i = 0; i < N - 1; i ++){ //代表x值
                for (int j = i + 1; j < N; j ++){ //代表y值
                    if (point2D[i].distanceTo(point2D[j]) < min){
                        min = point2D[i].distanceTo(point2D[j]);
                    }
                }
            }
            StdOut.println("min = " + min);
        }

    }
}
