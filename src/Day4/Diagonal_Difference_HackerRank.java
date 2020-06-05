package Day4;

import java.util.Scanner;

public class Diagonal_Difference_HackerRank {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] arr=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]=s.nextInt();
            }

        }
        int s1=0;
        for (int i = 0; i <n; i++) {
            s1+=arr[i][i];

        }
        int s2=0;
        for (int i = 0; i <n ; i++) {
//            System.out.println(arr[i][n-1-i]);
            s2+=arr[i][n-1-i];

        }
//        System.out.println(s1);
//        System.out.println(s2);
        System.out.println(Math.abs(s1-s2));
    }
}
