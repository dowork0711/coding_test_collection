package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char [] charArr = new char [input.length()];

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) - 3 < 'A') {
                charArr[i] = (char) (input.charAt(i) + 23);
            } else {
                charArr[i] = (char) (input.charAt(i) - 3);
            }
        }

        for (char ch : charArr) {
            System.out.print(ch);
        }

    }
}
