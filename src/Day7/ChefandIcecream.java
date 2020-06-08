package Day7;

import java.util.Scanner;

public class ChefandIcecream {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {

            int num=s.nextInt();
            int[] arr=new int[num];
            for (int j = 0; j <num ; j++) {
                arr[j]=s.nextInt();

            }
            int flag=1;
            int five=0;
            int ten=0;
            int fifteen=0;
            for (int j = 0; j <num ; j++) {

                if(j==0){
                    if(arr[j]==5){
                        five++;
                    }
                   else {
                        System.out.println("NO");
                        flag=0;
                        break;
                    }

                }
                else {
                    if(arr[j]==10){
                        if(five>0){
                            five--;
                        }
                        else {
                            System.out.println("NO");
                            flag=0;
                            break;
                        }
                    }
                    if (arr[j]==15){
                        if(ten>=1){
                            ten--;
                        }
                        else if(five>=2){
                            five=five-2;
                        }
                        else {
                            System.out.println("NO");
                            flag=0;
                            break;
                        }
                    }
                }




            }
            if(flag==1){
                System.out.println("YES");
            }

        }
    }
}
