package Day8;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Operation_on_a_tuple {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        for (int i = 0; i <t; i++) {
            int p=s.nextInt();
            int q=s.nextInt();
            int r=s.nextInt();

            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();

            int d1=a-p;
            int d2=b-q;
            int d3=c-r;
            int step=0;
           int x=d1+d2+d3;
            if(x%3==0){
                System.out.println(x/3-1);
            }
            else {
                System.out.println(x/3);
            }


        }
    }
}
