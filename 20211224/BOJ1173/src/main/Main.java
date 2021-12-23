package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*(대소문자 반전)
            t = 증가한 맥박
            x = 원래 맥박
            t+x = 1분간 운동을 한 후의 맥박
            t+x <= m ? 운동 : 운동안해
            r = 휴식을 하는 동안 감소하는 맥박
            x-r = 휴식을 한 후의 맥박
            x-r < m 안되고, x-r < m이면 맥박은 M
            N = 운동시

            5분 운동, 최소맥박 70, 최대맥박 120, 25증가, 휴식기간중 15감소

            운동을 못끝내는 경우 "현재맥박 + T < M"
        */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 운동시간
        int m = sc.nextInt();   // 초기의 맥박
        int M = sc.nextInt();   // 최대 맥박
        int T = sc.nextInt();   // 분당 증가하는 맥박
        int R = sc.nextInt();   // 분당 감소하는 맥박

        int res = 0;            // 답 출력
        int time = 0;           // 운동하는 시간
        int init = m;           // 초기 맥막

        while(time != N) {
            // 운동을 한 후의 맥박 < 최대 맥박일 때 운동을 하는거야
            if(m + T <= M) {
                m += T;
                time++;
            } else {    // 휴식을 취해야해
                m -= R;

                // 초기 맥박이 떨어지면 다시 세팅
                if(m < init) m = init;
            }

            // 운동 다하고 맥박이 최대보다 커
            // 다시 처음 맥박으로 돌아가
            // 운동 못해
            if((m + T) > M && (m == init)) break;

            res++;
        }

        if(time != N) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }
    }
}
