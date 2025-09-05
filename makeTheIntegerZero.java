import java.util.*;
import java.util.Scanner;


public class makeTheIntegerZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a= makeZero(n,m);
        System.out.println(a);
    }
    public static int makeZero(int num1,int num2){
        for(int k=1; k<=60; k++){
            long diff = (long) num1 - (long) k * num2;
            if (diff<0){
                continue;
            }
            int bits = Long.bitCount(diff);
            if(bits<=k && diff >= k){
                return k;
            }
        }
        return -1;
    }

}
