package Day7;

import java.util.Scanner;

public class ChefandPriceControl {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        for (int i = 0; i <t ; i++) {
            int num=s.nextInt();
            int k=s.nextInt();
            int[] arr=new int[num];
            int lost_rev=0;
            for (int j = 0; j <num ; j++) {
                arr[j]=s.nextInt();
            }
            for (int j = 0; j <num ; j++) {
                if(arr[j]>k){
                    lost_rev=lost_rev+(arr[j]-k);
                }

            }
            System.out.println(lost_rev);

        }
    }
}

