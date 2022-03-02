package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 입력받기
        int n = sc.nextInt();
        int m = sc.nextInt();

        StringBuilder firImg = new StringBuilder();
        StringBuilder secImg = new StringBuilder();

        /*
            String str1 = "abc";
            String str2 = "def";

            str1 + str2
        */

        for (int i = 0; i < n; i++) {
            firImg.append(sc.next());
        }

        for (int i = 0; i < n; i++) {
            secImg.append(sc.next());
        }

        boolean checker = true;

        /*
            ABCDE
            AABBCCDDEE
        */
        for (int i = 0; i < n*m*2; i++) {
            if(secImg.charAt(i) != firImg.charAt(i/2)) {
                checker = false;
                break;
            }
        }

        System.out.println(checker ? "Eyfa" : "Not Eyfa");

    }
}
