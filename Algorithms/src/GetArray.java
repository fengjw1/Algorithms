/**
 * Created by fengjw on 2017/7/4.
 */
 /*
    获取数组中的最大值、平均值
    P11
 */
public class GetArray {
    public static void main(String [] args){
        int N = 10;
        double [] a = new double[N];
        for(int i = 0; i < a.length; i ++){
            a[i] = Math.random();
            System.out.print(a[i] + " ");
        }

        //max
        double max = a[0];
        //average
        double sum = 0;
        // array b
        double [] b = new double[N];

        for(int i = 0; i < a.length; i ++){
            sum += a[i];
            b[i] = a[i];
            if(max < a[i]) {
                max = a[i];
            }
        }

        System.out.println();
        System.out.println("max = " + max);
        System.out.println("Average = " + sum / a.length);

        for(int i = 0; i < a.length/2; i++){
             double temp = a[i];
             a[i] = a[a.length - 1 -i];
             a[a.length - 1 -i] = temp;
        }
        for(int i = 0; i < a.length; i ++){
            System.out.print(a[i] + " ");
        }
            System.out.println();

//        int temp = 9;
//        System.out.println(temp / 2);   默认去掉小数


        for(int i = 0; i < a.length; i ++){
            a[i] = a[i] * b[i];
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //起别名
        double [] c = a;
        c[3] = 1;
        System.out.println("c[3] = " + c[3]);
        System.out.println("a[3] = " + a[3]);

        //二维数组
        int M = 10;
        double [][]  d = new double[M][N];
        int temp = 0;
        for(int i = 0; i < M; i ++){
            for(int j = 0; j < N; j ++){
                d[i][j] = Math.random();
                System.out.print(d[i][j] + " ");
                temp = 1;
            }
            // 换行
            if(temp == 1){
                System.out.println();
                temp = 0;
            }
        }
        System.out.println();
    }
}