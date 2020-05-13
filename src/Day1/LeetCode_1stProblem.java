package Day1;


import java.util.Scanner;

public class LeetCode_1stProblem {

    public static void main(String args[]) {
            Scanner s=new Scanner(System.in);

            int n=s.nextInt();

            for(int i=0;i<n;i++){

                int x=0;
                int n1=s.nextInt();
                int n2=s.nextInt();

                for(int j=n1;j<=n2;j++){
//                    System.out.println(n1);
//                    System.out.println(n2);
                    if(j==1||j==0){
                        continue;
                    }
                    if(j==2){
                        x++;
                        continue;
                    }
                    int flag=0;
//                    System.out.println(j);
                    if(j%2==0){
//                        System.out.println(j%2+"if");
                        flag=1;

                    }
                    else {
                        for(int k=3;k<=Math.abs(Math.sqrt(j));++k){
//                            System.out.println(j%k+"el");
                            if(j%k==0){
                                flag=1;
                                break;
                            }


                        }
                    }

                    if(flag==0){
                        x++;
                    }
                }
                System.out.println(x);


            }
        }
}



