package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

//        int[] result = new int [t];

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

//            result[i] = getLcm(p, q);
            int res = getLcm(p, q);
            sb.append(res).append("\n");
        }

//        StringBuilder sb = new StringBuilder();
//        for (int num : result) {
//            sb.append(num).append("\n");
//        }

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
