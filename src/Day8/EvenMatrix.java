package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class EvenMatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {
            int n=s.nextInt();
            int[][] arr=new int[n][n];
            int even=2;
            int odd=1;

            for (int j = 0; j <n ; j++) {
                for (int k = 0; k <n ; k++) {
                    if(j%2==0&&k%2==0){
                        arr[j][k]=odd;
                        odd+=2;
                    }
                    else if(j%2==0){
                        arr[j][k]=even;
                        even+=2;
                    }
                    else if(k%2==0){
                        arr[j][k]=even;
                        even+=2;
                    }
                    else {
                        arr[j][k]=odd;
                        odd+=2;
                    }


                }

            }




            for (int j = 0; j <n ; j++) {
                System.out.print(Arrays.toString(arr[j]).replace(",","").replace("[","").replace("]","").trim());
                System.out.println();
            }



        }
    }
}
