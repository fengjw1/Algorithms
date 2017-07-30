package chapter1.a3;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/30.
 */
public class Stats {
    public static void main(String [] args){
        Bag<Double> numbers = new Bag<>();
        while (!StdIn.isEmpty()){
            numbers.add(StdIn.readDouble());
        }

        int N = numbers.size();//这个是获得的总数
        double sum = 0.0;
        for (double x : numbers){
            sum += x;
        }

        double mean = sum / N;

        sum = 0.0;//为了省一个变量，再次使用方便
        for (double x : numbers){
            sum += (x - mean) * (x - mean);
        }

        double std = Math.sqrt(sum/(N - 1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n",std);


    }
}
