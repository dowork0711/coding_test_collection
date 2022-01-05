package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();      // 테스트 케이스

        for (int i = 0; i < tc; i++) {
            int cntStudent = sc.nextInt();  // 학생 수
            int[] scoreArr = new int [cntStudent];  // 점수 배열

            double avg = 0;
            double overAvg = 0;
            int cnt = 0;
            for (int j = 0; j < scoreArr.length; j++) {
                int score = sc.nextInt();
                scoreArr[j] = score;
                avg += score;
            }

            avg /= cntStudent;

            for (int k : scoreArr) {
                if (k > avg) {
                    cnt++;
                }
            }
            overAvg = (double) cnt / cntStudent * 100;

            System.out.printf("%.3f", overAvg);
            System.out.println("%");

        }

    }
}
