package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();                 // 색종이 개수

        int[][] coodinate = new int [100][100];

        int cnt = 0;

        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if(coodinate[j][k] == 1) continue;
                    coodinate[j][k] = 1;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

        sc.close();

    }
}
