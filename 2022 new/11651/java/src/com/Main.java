package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] numArr = new int[n][2];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            numArr[i][0] = Integer.parseInt(st.nextToken());
            numArr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numArr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return Integer.compare(o1[0], o2[0]);
                }
                return Integer.compare(o1[1], o2[1]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int[] num : numArr) {
            sb.append(num[0]).append(" ").append(num[1]).append("\n");
        }

        System.out.println(sb);
    }
}
