package com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();         // 가로
        int m = sc.nextInt();         // 세로

        int row = 0;
        int col = 0;

        char[][] castle = new char [n][m];

        // castle 배열에 도트나 X(경비원) 넣어주기
        for (int i = 0; i < castle.length; i++) {
            String dot = sc.next();
            for (int j = 0; j < castle[i].length; j++) {
                castle[i][j] = dot.charAt(j);
            }
        }

        sc.close();

        // System.out.println(Arrays.deepToString(castle));

        // 각 행에 필요한 경비원의 수
        for (int i = 0; i < n; i++) {
            boolean rep = true;
            for (int j = 0; j < m; j++) {
                if(castle[i][j] == 'X') {
                    rep = false;
                    break;
                }                
            }
            if(rep) row++;
        }

        // 각 열에 필요한 경비원의 수
        for (int i = 0; i < m; i++) {
            boolean rep = true;
            for (int j = 0; j < n; j++) {
                if(castle[j][i] == 'X') {
                    rep = false;
                    break;
                }
            }
            if(rep) col++;
        }

        // 추가해야 할 경비원 수
        System.out.println(Math.max(row, col));

        sc.close();

    }
}