package chapter1.a1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by fengjw on 2017/7/5.
 */
public class RandomSeq {
    public static void main(String [] args){
        String[] x = {"1","111"," 222"};
        int N = Integer.parseInt(x[0]);
        double lo = Double.parseDouble(x[1]);
        double hi = Double.parseDouble(x[2]);
        for(int i = 0; i < N; i ++){
            double temp = StdRandom.uniform(lo,hi);
            StdOut.printf("%.2f\n",temp);
        }
    }

}
