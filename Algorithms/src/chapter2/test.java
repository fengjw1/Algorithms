package chapter2;

import chapter1.a1.Average;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/4.
 */
public class test {
    public static void main(String[] args) {
        double sum = 0.0;
        int count =0;
        System.out.println("1");
        //System.out.println(StdIn.readDouble());
        while (!StdIn.isEmpty()){
            sum += StdIn.readDouble();
            count ++;
        }
        double average = sum / count;
        StdOut.printf("Average is %.5f\n", average);
    }
}