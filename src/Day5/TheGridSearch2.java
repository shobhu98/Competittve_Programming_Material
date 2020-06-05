package Day5;



import java.util.Scanner;

public class TheGridSearch2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int r = s.nextInt();
            int c = s.nextInt();
            int[][] arr_main = new int[r][c];
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    arr_main[j][k] = s.nextInt();
                }
            }
            int r1 = s.nextInt();
            int c1 = s.nextInt();
            int[][] arr_find = new int[r1][c1];
            for (int j = 0; j < r1; j++) {
                for (int k = 0; k < c1; k++) {
                    arr_find[j][k] = s.nextInt();

                }
            }
            int loc = arr_find[0][0];
            int flag = 1;
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {

                    if (arr_main[j][k] != loc) {
                        continue;
                    } else {
                        if (r1 + j <= r && c1 + k <= c) {
                            for (int l = 0; l < r1; l++) {
                                for (int m = 0; m < c1; m++) {
                                    if (arr_find[l][m] == arr_main[l+j][m + k]) {
                                        continue;

                                    } else {
                                        System.out.println("NO");
                                        flag = 0;
                                        break;
                                    }
                                }
                                if (flag != 1) {
                                    break;
                                }

                            }
                            if (flag != 1) {
                                break;
                            }
                        }

                    }
                    if (flag != 1) {
                        break;

                    }
                }
                if (flag != 1) {
                    break;

                }


            }
            if(flag==1){
                System.out.println("YES");
            }

        }
    }
}

