package chapter1.a2;


import edu.princeton.cs.algs4.StdIn;

/**
 * Created by fengjw on 2017/7/29.
 */
public class Rational {

    private int numerator;
    private int denominator;
    private int MAX = 2147483647;
    private int MIN = -2147483648;

    public Rational(int numerator, int denominator) throws ArithmeticException{
        if (denominator == 0){
            throw new ArithmeticException("Divide by zero.");
        }

        //分母不能为0
        if (denominator < 0){
            denominator = -denominator;
            numerator = -numerator;
        }

        /*
        这里是求分子和分母去掉公因子的最简形式
        (保证分子分母没有公因子)
         */
        int commonDivisor = Enclid(numerator,denominator);// 最大公约数Divisor
        this.numerator = numerator / commonDivisor;
        this.denominator = denominator / commonDivisor;

    }


    //plus
    public Rational plus(Rational b){ //assert 断言 assert <boolean表达式> : <错误信息表达式>
        assert isPlusOverflow(numerator * b.denominator, b.numerator * denominator) : "Plus overflow";
        assert isTimesOverflow(denominator, b.denominator) : "Times overflow";
        int n = numerator * b.denominator + denominator * b.numerator;
        int d = denominator * b.denominator;
        return new Rational(n,d);
    }

    //minus
    public Rational minus(Rational b){
        return new Rational(numerator * b.denominator - b.numerator * denominator, denominator * b.denominator);
    }

    //times
    public Rational times(Rational b){
        assert isTimesOverflow(numerator, b.numerator) : "Times overflow";
        assert isTimesOverflow(denominator, b.denominator) : "Times overflow";
        return new Rational(numerator * b.numerator, denominator * b.denominator);
    }

    public Rational divides(Rational b){
        return new Rational(numerator * b.denominator, denominator * b.numerator);
    }

    public  boolean equlas(Object object){

        if (this == object){
            return true;
        }

        if (object == null){
            return false;
        }

        if (this.getClass() != object.getClass()){
            return false;
        }

        Rational that = (Rational) object;
        if (this.numerator != that.numerator){
            return false;
        }

        if (this.denominator != that.denominator){
            return false;
        }
        return true;
    }

    //默认一定会执行的方法。
    public String toString(){
        if (Math.abs(numerator) % Math.abs(denominator) == 0){
            return String.valueOf(numerator / denominator);
        }else {
            return numerator + "/" + denominator;
        }
    }

    private int Enclid(int p, int q){
        if (p == 0 || q == 0)
            return 1;
        p = Math.abs(p);
        q = Math.abs(q);
        if(p < q){
            int temp = q;
            q = p;
            p = temp;
        }
        if (p % q == 0){
            return q;
        }else {
            return Enclid(q, p % q);
        }
    }

    private boolean isPlusOverflow(int a, int b){
        return a >= 0 ? a + b < MAX : a + b > MIN;
    }

    private boolean isTimesOverflow(int a, int b){
        if (a < 0)
            a = -a;
        if (b < 0)
            b = -b;
        if (a == 0 || b == 0){
            return false;
        }else {
            return a * b < MAX;
        }
    }


    public static void main(String [] args){
        System.out.println("Rational a:");
        System.out.print("numerator: ");
        int numerator = StdIn.readInt();
        System.out.print("denominator: ");
        int denominator = StdIn.readInt();
        Rational a = new Rational(numerator, denominator);
        System.out.println("Rational b:");
        System.out.print("numerator: ");
        numerator = StdIn.readInt();
        System.out.print("denominator: ");
        denominator = StdIn.readInt();
        Rational b = new Rational(numerator, denominator);
        System.out.println("a plus b: " + a.plus(b));
        System.out.println("a minus b: " + a.minus(b));
        System.out.println("a times b: " + a.times(b));
        System.out.println("a divides b: " + a.divides(b));
        System.out.println("a equals b: " + a.equals(b));
    }
}
