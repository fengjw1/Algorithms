package chapter1.a2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/29.
 */
public class VisualCounter {
    private int N;
    private int n;
    private int count;
    private int max;
    VisualCounter(int N, int max){
        this.N = N;
        this.max = max;
        n = 0;
        count = 0;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(-max,max);
        StdDraw.point(0,0);
        StdDraw.setPenRadius(0.01);
    }

    public void increment(){
        if (n + 1 > N){
            StdOut.println("Operate too much!");
            return;
        }
        if (count + 1 > max){
            StdOut.println("Exceed the max!");
            return;
        }
        count ++;
        n ++;
        StdDraw.point(n,count);
    }

    public void decrement(){
        if (n + 1 > N){
            StdOut.println("Operate too much!");
        }
        if (count - 1 < -max){
            StdOut.println("Exceed the min!");
        }
        count --;
        n ++;
        StdDraw.point(n,count);
    }

    public int getCount(){
        return count;
    }

    public static void main(String [] args){
        VisualCounter visualCounter = new VisualCounter(40,15);
        for (int i = 0; i < 10; i ++){
            visualCounter.increment();
        }
        for (int i = 0; i < 15; i ++){
            visualCounter.decrement();
        }
        for (int i = 0; i < 10; i ++){
            visualCounter.increment();
        }
        StdOut.println(visualCounter.getCount());
    }

}
