package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int len = word.length();
        boolean flag = true;
        for (int i = 0; i < len; i++) {
            if(word.charAt(i) != word.charAt(len-(i+1))) {
                flag = false;
                break;
            }
        }

        int res;
        res = flag ? 1 : 0;

        System.out.println(res);

    }
}
