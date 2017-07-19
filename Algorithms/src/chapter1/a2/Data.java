package chapter1.a2;

/**
 * Created by fengjw on 2017/7/19.
 */
public class Data implements Datable {
    @Override
    public int year() {
        return 0;
    }

    @Override
    public int month() {
        return 0;
    }

    @Override
    public int day() {
        return 0;
    }

    public String toString(){
        return month() + "/" + day() + "/" + year();
    }

    public boolean equals(Object x){
        if(this == x) return true;
        if(x == null) return false;
        if(this.getClass() != x.getClass()) return false;
        Data that = (Data) x;
        if(this.day() != that.day()) return false;
        if(this.month() != that.month()) return false;
        if(this.year() != that.year()) return false;
        return true;
    }


}
