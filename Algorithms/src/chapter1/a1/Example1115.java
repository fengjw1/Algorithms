package chapter1.a1;

/**
 * Created by fengjw on 2017/7/11.
 */
public class Example1115 {
    public static int[] histogram(int []a, int M){
        int[] R =new int[M];
        for(int i = 0; i < M; i ++){
            R[i] = 0; //将默认数组清空
        }

        for(int i = 0; i < a.length; i ++){
            if(a[i] >= 0 && a[i] < M ){
                R[a[i]] ++;
            }else{
                System.out.println("存在数字不在0到M-1之间,为：" + a[i]);
            }
        }
        return R;
    }

}
