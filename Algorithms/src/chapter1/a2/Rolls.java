package chapter1.a2;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by fengjw on 2017/7/18.
 */
public class Rolls {
    public static void main(String [] args) {
        int T = Integer.parseInt("111");//这个是表示循环出现的次数
        int SIDES = 6;//sides
        Counter[] rolls = new Counter[SIDES + 1];
        for(int i = 1; i <= SIDES; i ++)
            rolls[i] = new Counter(i + "'s");
        for(int t = 0; t < T; t ++){
            int result = StdRandom.uniform(1,SIDES + 1);//包含左边界，不包含右边界
            rolls[result].increment();//每次都是对应的1~6下表的数字的内容+1
        }
        for (int i = 1; i <= SIDES; i ++){
            StdOut.println(rolls[i]);
        }
    }
}
