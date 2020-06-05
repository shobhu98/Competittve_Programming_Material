package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Non_Divisible_Subset {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();

        }
        int size=0;
        int max=1;
        int max_size=0;
        for (int m = 0; m <n ; m++) {
            ArrayList list=new ArrayList();
            list.add(arr[m]);

            for (int i = 0; i <n ; i++) {
                if(i==m){
                    continue;
                }
                int x=arr[i];
                int flag=1;
                for (int j = 0; j <list.size() ; j++) {
                    if((x+(int)(list.get(j)))%k==0){
                        flag=0;
                        break;
                    }

                }
                if(flag==1){
                    if(m==0){
                        max++;
                        size++;
                        list.add(x);
                    }
                    else {
                        size++;
                        list.add(x);

                    }
                }
                max_size=Math.max(size,max);


            }
            size=0;
        }
        System.out.println(max_size);









        }
    }

