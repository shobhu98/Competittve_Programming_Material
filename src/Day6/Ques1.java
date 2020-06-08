package Day6;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        for (int i = 0; i <t ; i++) {
            int r=s.nextInt();
            int c=s.nextInt();
            int[][] arr=new int[r][c];
            for (int j = 0; j <r ; j++) {
                for (int k = 0; k <c ; k++) {
                    arr[j][k]=s.nextInt();

                }

            }
            int x=0;

            for (int j = 0; j <r ; j++) {


                for (int k = 0; k <c ; k++) {
                    int flag=1;
                    int finale=1;
                    if(arr[j][k]==1){
                        continue;
                    }
              
                    else {
                        for (int l = 0; l <c ; l++) {

//                            System.out.println("I run");

                            if(l!=k){
                                if(arr[j][l]==1){
                                    flag=0;
                                    finale=0;
                                    break;

                                }

                            }


                        }
                        if(finale==0){
//                                System.out.println(finale+"fin");
//                                System.out.println(x);
                            break;
                        }


                        for (int l = 0; l <r ; l++) {
                            if(l!=j){
                                if(arr[l][k]==1){
                                    flag=0;

                                    break;
                                }


                            }

                        }
//                        System.out.println(x);




                    }
                    if(flag==1){
                        arr[j][k]=1;
//                        System.out.println("here");
                        x++;
                    }

                }



            }
            if(x%2==1){
                System.out.println("Ashish");
            }
            else {
                System.out.println("Vivek");
            }
//            for (int j = 0; j <r ; j++) {
//                for (int k = 0; k <c ; k++) {
//                    System.out.println(arr[j][k]);
//
//                }
//
//            }


        }

    }
}
