package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(); // 배열 행 개수
        int col = sc.nextInt(); // 배열 열 개수

        int[][] numArr = new int [row+1][col+1];

        // 행렬에 값 넣어주기
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                numArr[i][j] = sc.nextInt();
            }
        }

        int rep = sc.nextInt();
        int sum;
        for (int i = 0; i < rep; i++) {
            sum = 0;
            int px = sc.nextInt();
            int py = sc.nextInt();
            int qx = sc.nextInt();
            int qy = sc.nextInt();

            for (int j = px; j <= qx; j++) {
                for (int k = py; k <= qy; k++) {
                    sum += numArr[j][k];
                }
            }

            System.out.println(sum);
        }


    }
}
