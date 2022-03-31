package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();     // 첫번째 입력
        int num = sc.nextInt();     // 두번째 입력

        int checker = 0;
        for (int i = 0; i < num; i++) {
            String ring = sc.next();        // 반지 입력받기
            ring += ring;

            if (ring.contains(str)) checker += 1;  // 입력받은 반지에 첫번째 입력받은 문자열이 포함되면 체커에 1씩 더해줌
        }

        System.out.println(checker);

        sc.close();

    }
}
