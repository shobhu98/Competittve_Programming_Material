package Day4;

import java.util.Scanner;

public class Climbing_The_Leaderboard_Hackerrank {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] score=new int[n];
        for (int i = 0; i <n ; i++) {
            score[i]=s.nextInt();
        }
        int m=s.nextInt();
        int[] alice_score=new int[m];
        for (int i = 0; i <m ; i++) {
            alice_score[i]=s.nextInt();

        }
        int[] rank_arr=new int[n];
        int rank=1;
        rank_arr[0]=rank;
        for (int i = 1; i <n ; i++) {
            if(score[i]==score[i-1]){
                rank_arr[i]=rank;
            }
            else {
                rank++;
                rank_arr[i]=rank;
            }
        }
        int[] alice_rank=new int[m];
        for (int i = 0; i <m ; i++) {
            int latest=alice_score[i];
            for (int j = 0; j <n; j++) {
                if(score[n-j-1]>latest){
                    alice_rank[i]=rank_arr[n-j-1]+1;
                    break;
                }
                else if(latest>score[0]){
                    alice_rank[i]=1;
                    break;
                }

            }



        }
        for (int j = 0; j <m ; j++) {
            System.out.println(alice_rank[j]);

        }


    }

}
