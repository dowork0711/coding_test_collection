package main;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int[] arr = new int [26];

        Arrays.fill(arr, -1);

        /* * 아래의 for 루프는 Arrays.fill(array_name, value)로 표현할 수 있음.
            for (int i = 0; i < arr.length; i++) {
                arr[i] = -1;
            }
        */

        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i)-97;
            if(arr[n] >= 0) {
                continue;
            }
            arr[n] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }

        br.close();
        bw.close();

    }
}
