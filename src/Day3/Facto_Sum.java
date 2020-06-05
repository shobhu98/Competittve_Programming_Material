package Day3;

import java.util.Scanner;

public class Facto_Sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
      int  sum=0;
        for (int i = 0; i <n ; i++) {
            int x=arr[i];
            int fac=1;
            for (int j = 1; j <=x ; j++) {
                if(x==0){
                    break;
                }
                fac=fac*j;
            }
            sum+=fac;

        }
        System.out.println(sum%107);
    }
}
