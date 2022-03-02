package com;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*
        전략
        1. 8 x 8 체스판에서 검은색과 흰색이 번갈아 칠해져야 함.
        2. 겹쳐 색칠되는 공간의 개수를 찾는다.
        3. 8 x 8 크기로 잘라서 생각하면 다양한 경우의 체스판이 나올 수 있다.
        4. 8 x 8 크기로 잘라서 나온 여러개의 체스판 중에서 다시 칠해야 할 정사각형의 개수를 구한다.
    */

    public static void main(String[] args) {

        // 입력받기
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] chess = new boolean[n][m];

        sc.nextLine();  // 버퍼 비우기

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine().trim();
            for (int j = 0; j < m; j++) {
                chess[i][j] = str.charAt(j) == 'W';
            }
        }

        int row = n - 7;
        int col = m - 7;
        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res = search(i, j, chess);
            }
        }

        System.out.println(res);



    }

    public static int search(int x, int y, boolean[][] chess) {
        int chessX = x+8;
        int chessY = y+8;

        int min = 64;

        boolean explore = chess[x][y];

        int cnt = 0;
        for (int i = x; i < chessX; i++) {
            for (int j = y; j < chessY; j++) {
                if(chess[x][y] != explore) {
                    cnt += 1;
                }

                // 다음칸 색이 바뀌게
                explore = !explore;
            }
            explore = !explore;
        }

        cnt = Math.min(cnt, 64-cnt);
        min = Math.min(min, cnt);

        return min;
    }
}
