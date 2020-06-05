package Day4;

import java.util.Scanner;

public class Grading_Students_HackerRank {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int[] xx=grade(arr,n);
        for (int i = 0; i <n ; i++) {
            System.out.println(xx[i]);

        }


    }
    public static int[] grade(int[] arr,int n){
        int[] a= new int[n];
        for (int i = 0; i <n ; i++) {
            int t=arr[i];
            if(t<38){
                a[i]=t;
//                System.out.println(t);
                System.out.println("a");

            }
            else {
                if(t%5<=2){
//                    System.out.println(t);
                    System.out.println("b");
                    a[i]=t;
                }
                else {
                    int x=t/5;
//                    System.out.println(x);
                    t=5*(x+1);
                    a[i]=t;
//                    System.out.println(t);
                    System.out.println("c");
                }
            }

        }

        return a;
    }
}
