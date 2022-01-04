package main;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int p = n;

        int i = 0;
        while(true) {
            int x = p / 10;     // p의 십의 자리 수
            int y = p % 10;     // p의 일의 자리 수
            int sum = x + y;

            p = (y * 10) + (sum % 10);
            i++;

            if (p == n) break;
        }

        bw.write(i + "\n");

        bw.close();
        br.close();
    }
}
