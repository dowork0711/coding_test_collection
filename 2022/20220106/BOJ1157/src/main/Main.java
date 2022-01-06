package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String words = br.readLine().toUpperCase(Locale.ROOT);

        int[] count = new int [26];

        int max = 0;
        char res = '?';
        for (int i = 0; i < words.length(); i++) {
             count[words.charAt(i) - 65]++;

            if(max < count[words.charAt(i) - 65]) {
                max = count[words.charAt(i) - 65];
                res = words.charAt(i);
            } else if (max == count[words.charAt(i) - 65]) {
                res = '?';
            }
        }

        System.out.println(res);

        br.close();

    }
}
