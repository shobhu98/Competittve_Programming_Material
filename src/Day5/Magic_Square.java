package Day5;

import java.util.Scanner;

public class Magic_Square {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                arr[i][j]=s.nextInt();

            }

        }
     int h1=arr[0][0]+arr[0][1]+arr[0][2];
     int h2=arr[1][0]+arr[1][1]+arr[1][2];
     int h3=arr[2][0]+arr[2][1]+arr[2][2];

     int v1=arr[0][0]+arr[1][0]+arr[2][0];
     int v2=arr[0][1]+arr[1][1]+arr[2][1];
     int v3=arr[0][2]+arr[1][2]+arr[2][2];

     int d1=arr[0][0]+arr[1][1]+arr[2][2];
     int d2=arr[0][2]+arr[1][1]+arr[2][0];



    }
}
