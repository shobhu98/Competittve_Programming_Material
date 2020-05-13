package Day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Running_Sum {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        ArrayList arr=new ArrayList();
        int sum=0;
        int ch=0;
        while(true){
            int n=s.nextInt();
            sum=sum+n;
            if(sum>=0){
               arr.add(n);
                continue;
            }
            else{
                for (int i = 0; i < arr.size(); i++) {
                    System.out.println(arr.get(i));
                }
                break;
            }
        }

    }
}
