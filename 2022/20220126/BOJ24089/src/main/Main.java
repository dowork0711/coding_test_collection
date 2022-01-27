package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // BOJ24089
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();                   // 공의 개수
        int m = sc.nextInt();                   // 조작 횟수
        
        int[] box = new int [n];                // 박스를 공의 개수만큼 만들어줌

        for (int i = 0; i < box.length; i++) {
            box[i] = i+1;                       // 조작하기 전 조건에 맞게 공 초기화
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();               // 꺼낼 공
            int y = sc.nextInt();               // 옮길 상자
            box[x-1] = y;
        }

        for (int ball : box) {
            System.out.println(ball);           // 개행을 두고 공을 순서대로 출력
        }

    }
}
