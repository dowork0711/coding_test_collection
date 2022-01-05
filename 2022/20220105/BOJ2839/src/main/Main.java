package main;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            설탕 3kg, 5kg
            최대한 적은 개수로 가져감.
            18kg => 5kg * 3 + 3kg * 1
            정확하게 맞출 수 없는 경우 -1
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 4 || n == 7) {
            System.out.println(-1);
        } else if (n % 5 == 0) {
            System.out.println(n / 5);
        } else if (n % 5 == 1 || n % 5 == 3) {
            System.out.println((n / 5) + 1);
        } else if (n % 5 == 2 || n % 5 == 4) {
            System.out.println((n / 5) + 2);
        }

        br.close();
    }
}
