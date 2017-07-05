package chapter1.a1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/5.
 */
public class Average {

    public static void main(String[] args) {
        double sum = 0.0;
        int count = 0;
        System.out.println("1");
        //System.out.println(StdIn.readDouble());
        try {
            while (!StdIn.isEmpty()) {
                sum += StdIn.readDouble();
                count++;
            }
            double average = sum / count;
            StdOut.printf("Average is %.5f\n", average);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
