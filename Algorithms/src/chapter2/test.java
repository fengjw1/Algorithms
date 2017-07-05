package chapter2;

import java.util.Scanner;

/**
 * Created by fengjw on 2017/7/4.
 */
public class test {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        // Define an array of integers of size N.
        int[] numArray = new int[N];


        int sum = 0;
        for(int i=0; i<N; i++){
            numArray[i] = s.nextInt(); // Get the input
        }

        // Write the logic to add these numbers here:
        for(int i = 0; i < numArray.length; i ++){
            sum += (numArray[i] * numArray[i]);
        }



        // Print the sum
        System.out.print(sum);
        s.close();
        }

}
