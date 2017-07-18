package chapter1.a2;

/**
 * Created by fengjw on 2017/7/18.
 */
public class Counter {
    private final String name;
    private int count;

    public Counter(String id){
        name = id;
    }
    public void increment(){
        count++;
    }
    public int tally(){
        return count;
    }
    public  String toString(){
        return count + " " + name;
    }
}
