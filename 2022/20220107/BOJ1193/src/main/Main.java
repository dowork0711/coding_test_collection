package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        /*
            1/1                             ...... n
            2/1  1/2                        ...... n+1
            3/1  2/2  1/3                   ...... n+2
            4/1  3/2  2/3  1/4              ...... n+3
            5/1  4/2  3/3  2/4  1/5         ...... n+4
            6/1  5/2  4/3  3/4  2/5  1/6    ...... n+5

            등차수열 n(n+1)/2, n은 n번째까지 항의 개수
        */

        int col = 0;
        int cnt = 0;

        while (cnt < x) {
            col++;
            cnt = col * (col + 1) / 2;
        }

        // System.out.println(col);
        // System.out.println(cnt);

        int t;
        int b;

        if (col % 2 != 0) {
            t = 1 + (cnt - x);
            b = col - (cnt - x);
            System.out.println(t + "/" + b);
        } else {
            t = col - (cnt - x);
            b = 1 + (cnt - x);
            System.out.println(t + "/" + b);
        }


    }
}
