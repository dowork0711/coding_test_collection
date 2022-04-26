package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 이거를 코틀린으로 바꿔보겠읍니다. */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            int res = getLcm(p, q);
            sb.append(res).append("\n");
        }

        System.out.println(sb);
    }

    public static int getGcd(int p, int q) {
        if (p % q == 0) {
            return q;
        }
        return getGcd(q, p % q);
    }

    public static int getLcm(int p, int q) {
        return p * q / getGcd(p, q);
    }
}
