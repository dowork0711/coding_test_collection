package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력받기
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        // 글자를 쪼개서 넣어줄 배열
        char [] charArr = new char [input.length()];

        // 세글자씩 당겨서 ASCII 'A'와 값 비교
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)-3<'A') { // D ~ Z까지에 대한 처리
                charArr[i] = (char) (input.charAt(i)+23);
            } else {    // A, B, C에 대한 처리
                charArr[i] = (char) (input.charAt(i)-3);
            }
        }

        // 출력
        for (int i = 0; i < input.length(); i++) {
            System.out.print(charArr[i]);
        }

    }
}
