package Day8;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Operation_on_a_tuple {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        for (int i = 0; i <t; i++) {
            long p=s.nextInt();
            long q=s.nextInt();
            long r=s.nextInt();

            long a=s.nextInt();
            long b=s.nextInt();
            long c=s.nextInt();

//            long d1=a-p;
//            long d2=b-q;
//            long d3=c-r;
            int flag=0;
            int step=1;
         while (true){
             long d1=a-p;
             long d2=b-q;
             long d3=c-r;
             if(d1==0&&d2==0&d3==0){
                 System.out.println(0);
                 break;
             }
             if(a/p==b/q&&b/q==c/r&&a%p==0&&b%q==0&&c%r==0){
                 System.out.println(step);
                 break;
             }
             else if (a%p==0&&b%q==0&&c%r==0) {
                 System.out.println(step);
                 break;


             }

           else   if((a/p==b/q&&a%p==0&&b%q==0&&c%r!=0)||(c/r==b/q&&c%r==0&&b%q==0&&a%p!=0)||(c/r==a/p&&a%p==0&&c%r==0&&b%q!=0)){
                 System.out.println(2);
                 break;
             }
             else if((d1==0&&d2!=0&&d3!=0)||(d2==0&&d1!=0&&d3!=0)||(d3==0&&d2!=0&&d1!=0)){
                 if(d1==0){
                     if(d2==d3){
                         System.out.println(1);
//                         System.out.println("a");
                         break;
                     }
                     else  {
                         System.out.println(2);
//                         System.out.println("b");

                         break;
                     }
                 }
                 if(d2==0){
                     if(d1==d3){

                         System.out.println(1);
//                         System.out.println("c");

                         break;
                     }
                     else  {
                         System.out.println(2);
                         break;
                     }
                 }
                 if(d3==0){
                     if(d1==d2){
                         System.out.println(1);
                         break;
                     }
                  else    {
                         System.out.println(2);
                         break;
//                         System.out.println("d");

                     }
                 }




             }
             else if((d1==0&&d2==0&&d3!=0)||(d2==0&&d1==0&&d3!=0)||(d3==0&&d2==0&&d1!=0)) {
                 System.out.println(1);
                 break;
             }
             else if((d1==d2&&d2!=d3)||(d2==d3&&d2!=d3)||(d3==d1&&d1!=d3)){
                 System.out.println(2);
                 break;
             }
             else if(d1==d2&&d2==d3){
                 System.out.println(1);
                 break;
             }
             else if(d1!=d2&&d2!=d3) {
                 long d=Math.min(d1,d2);
                 d=Math.min(d,d3);
                 p=p+d;
                 q=q+d;
                 r=r+d;
                 step++;
//                 System.out.println(3);
//                 break;
             }
             }

         }



        }
    }

