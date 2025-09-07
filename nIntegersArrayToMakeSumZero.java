import java.util.*;
import java.util.Scanner;
public class nIntegersArrayToMakeSumZero {
    public static int[] sumZero(int n){
        int[] result = new int[n];
        int sum = 0;
        for(int i = 0; i<n-1; i++){
            result[i]=i+1;
            sum+=i+1;
        }
        result[n-1]=-(sum);
        return result;
    }
    public static void main(String[] args){
        int s;
        Scanner sc= new Scanner(System.in);
        s = sc.nextInt();
        int p[]=sumZero(s);
        for(int i=0; i<s; i++){
            System.out.println(p[i]);
        }
    }
}
