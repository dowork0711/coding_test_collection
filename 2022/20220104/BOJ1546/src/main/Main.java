package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        int[] scoreArr = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            int score = sc.nextInt();
            scoreArr[i] = score;
        }

        int m = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i] > m) {
                m = scoreArr[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += (double) scoreArr[i] / m * 100 / testCase;

        }

        sc.close();

        System.out.println(sum);

    }
}
