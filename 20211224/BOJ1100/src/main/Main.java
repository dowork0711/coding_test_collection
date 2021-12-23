package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] chess = new char[8][8];

        String str = "";
        int cnt = 0;

        for (int i = 0; i < chess.length; i++) {
            str = sc.nextLine();
            for (int j = 0; j < chess.length; j++) {
                chess[i][j] = str.charAt(j);

                if((i+j) % 2 == 0 && chess[i][j] == 'F') {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
