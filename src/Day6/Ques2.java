package Day6;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {
            int size=s.nextInt();
            if(size==1){
                System.out.println("Yes");
                continue;
            }
//            int nn=s.nextInt();
            int[] arr=new int[size];
            for (int j = 0; j <size ; j++) {
                arr[j]=s.nextInt();

            }
            int[] deter=new  int[size];
            for (int j = 0; j <size ; j++) {
             deter[j]=s.nextInt();
            }
            int c=0;
            for (int j = 0; j <size-1 ; j++) {
                if(arr[j+1]>=arr[j]){
                    c++;
                }

            }
            System.out.println(c);
            if(c==size-1){
                System.out.println("Yes");
                continue;
            }

            for (int j = 0; j <size -1; j++) {
                int f=1;
                for (int k = j; k < size-1; k++) {
                    int yo=0;
                    if(deter[j+1]!=deter[j]){
                        if(arr[j+1]<arr[j]){
                            int x=arr[j+1];
                            arr[j+1]=arr[j];
                            arr[j]=x;
                            int y=deter[j+1];
                            deter[j+1]=deter[j];
                            deter[j]=y;
                            for (int l = 0; l <size ; l++) {
                                if(arr[i+1]>=arr[i]){
                                    yo++;

                                }
                            }
                            if(yo==size-1){

                                System.out.println("Yes");
                                break;
                        }




                        }
                    else {
                        System.out.println("No");
                        f=0;
                        break;
                    }
                    }
                if(f==0){
                    break;
                }



                }

            }

        }

    }
}
