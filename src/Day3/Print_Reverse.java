package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Print_Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        ArrayList<Integer> arr=new ArrayList();
        while (n!=0){
          int  r=n%10;
            arr.add(r);
            n=n/10;
        }
        int sum=0;
        int x=1;
        for (int i = arr.size()-1; i >=0 ; i--) {
          int q=  arr.get(i);
            sum=sum+x*q;
            x=x*10;


        }
        System.out.println(sum);
    }
}
