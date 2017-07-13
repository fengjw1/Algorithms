package chapter1.a1;

/**
 * Created by fengjw on 2017/7/13.
 */
public class Example1122 {

    public static String rank(int key, int[] a){
        int low = 0;
        int height = a.length - 1;
        return rank(key, a, low, height, 0);
    }

    public static String rank(int key, int[] a, int low, int height,int depth){
        if(low > height) return "ERROR!";
        int mid = low + (height-low)/2;
        if(key > a[mid]) return rank(key, a, mid + 1,height, depth + 1);
        else if(key < a[mid]) return rank(key, a, low, mid - 1, depth + 1);
        else return "mid = " + mid + " depth = " + depth;
    }
}
