package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(ROT13(str));

    }

    public static String ROT13(String str) {
        StringBuilder sb = new StringBuilder();
        char[] rot13Arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if(rot13Arr[i] >= 'A' && rot13Arr[i] <= 'Z') {
                if(rot13Arr[i] >= 'N') {
                    rot13Arr[i] -= 13;
                } else {
                    rot13Arr[i] += 13;
                }
            } else if (rot13Arr[i] >= 'a' && rot13Arr[i] <= 'z') {
                if(rot13Arr[i] >= 'n') {
                    rot13Arr[i] -= 13;
                } else {
                    rot13Arr[i] += 13;
                }
            }
        }

        for (char ch: rot13Arr) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
