package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력받기
        Scanner sc = new Scanner(System.in);

        // 단어의 개수
        int n = sc.nextInt();

        /*
            그룹단어가 무엇이냐? 단어에서 문자가 연속하는 경우, 같은 글자가 떨어져있으면 그룹단어가 아님..
                            알파벳이 연속되는 경우가 아니라면 한번만 나와야함.

            1, 2, 3, ..., n개의 알파벳이 각각 달라야한다.
        */

        // 단어의 개수를 대입할 변수선언
        int ref = n;

        for (int i = 0; i < n; i++) {       // 테스트 케이스만큼 단어를 입력받는다.
            String word = sc.next();        // 단어 입력 받기
            boolean[] wordChecker = new boolean[26];    // 체크를 위한 배열, 알파벳 개수만큼, 이미 등장한 문자는 true로 바뀜

            for (int j = 1; j < word.length(); j++) {   // 입력받은 단어의 길이만큼 loop

                // n번째 문자와 n+1번째 문자를 비교한다.
                if(word.charAt(j-1) != word.charAt(j)) {

                    // n+1번째 문자가 이전에 나왔는지 비교한다.
                    if(wordChecker[word.charAt(j) - 97]) {
                        ref--;      // 그룹단어가 아닌 경우이므로 1을 빼준다.
                        break;
                    }

                    // 체크 배열에서 현재 알파벳의 위치를 true로 바꾼다.
                    wordChecker[word.charAt(j-1)-97] = true;
                }
            }

        }

        System.out.println(ref);

    }
}
