package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();      // 성냥의 개수
        int w = sc.nextInt();       // 박스 가로의 크기
        int h = sc.nextInt();       // 박스의 세로 크기

        List<Integer> list = new ArrayList<>();     // 성냥을 담을 리스트

        for (int i = 0; i < cnt; i++) {             // 리스트에 성냥을 추가
            list.add(sc.nextInt());
        }

        for (Integer integer : list) {
            if (integer <= w && integer <= h) {     // 성냥이 박스의 가로, 세로 크기 이하일 때
                System.out.println("DA");
            } else if ((integer * integer) <= ((w * w) + (h * h))) {        // 성냥이 박스의 대각선 길이 이하일 때
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }

    }
}
