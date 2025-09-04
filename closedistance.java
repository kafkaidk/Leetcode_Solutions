import java.util.*;
import java.util.Scanner;

public class closedistance {
    private static int findClosest(int x, int y, int z) {
        int a = Math.abs(y-z);
        int b = Math.abs(x-z);
        if (a>b)
            return 1;
        
        else if(a<b)
            return 2;
        
        else
            return 0;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int p = findClosest(x,y,z);
        System.out.println(p);
        sc.close();
}
}
