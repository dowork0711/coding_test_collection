package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] numArr = new long[n+1];

        numArr[0] = 0;
        numArr[1] = 1;

        for (int i = 2; i <= n; i++) {
            numArr[i] = numArr[i-1] + numArr[i-2];

        }

        sc.close();

        System.out.println(numArr[n]);

    }
}
