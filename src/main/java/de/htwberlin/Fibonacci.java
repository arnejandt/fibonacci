package de.htwberlin;
import java.util.Arrays;

public class Fibonacci {
    private static long[] fibs = new long[50];

    public static long [] fibonacci(long n){
        return fibonacci(new long[(int) n],0);
    }
    private static long [] fibonacci (long [] a, int i){
        if(i >= a.length){
            return a;
        }
        a[i] = i == 0 || i == 1 ? 1 : a[i - 2] + a[i - 1];
        return fibonacci(a, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacci(15)));
    }
}
