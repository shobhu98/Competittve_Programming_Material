package Day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Number369 {
    //Not done using DP
    //Will look back to this question
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList arr=new ArrayList();
        int t=s.nextInt();

                for (int i = 0; i <t ; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
                    int num=0;
            int r;
            for (int j = a; j <=b ; j++) {

                int three=0;
                int six=0;
                int nine=0;
                int x=j;
                while(x!=0){
                    r=x%10;
                    x=x/10;
                    if(r==3){
                        three++;
                    }
                     if(r==6){
                        six++;
                    }
                     if(r==9){
                        nine++;
                    }

                }
                if(three==six&& six==nine&&three>=1){
                    num++;
//                    arr.add(j);

                }
            }
                    System.out.println(num);
//                    System.out.println("\n");
//                    System.out.println(arr);


        }

    }
}
