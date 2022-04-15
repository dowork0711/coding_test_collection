package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 점의 개수
        int len = Integer.parseInt(br.readLine());

        // 좌표를 넣어줄 2차원 배열 선언, 초기화
        int[][] numArr = new int [len][2];

        // BufferedReader를 사용해서 줄단위로 읽은 문자열을 토큰으로 끊고 숫자로 바꿔서 배열에 각각 넣기
        StringTokenizer st;
        for (int i = 0; i < numArr.length; i++) {
            st = new StringTokenizer(br.readLine());
            numArr[i][0] = Integer.parseInt(st.nextToken());
            numArr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 정렬
        // Arrays.sort(numArr, (num1, num2) -> {
        //     if (num1[0] == num2[0]) {
        //         return num1[1] - num2[1];
        //     } else {
        //         return num1[0] - num2[0];
        //     }
        // });

        Arrays.sort(numArr, new Comparator<int[]>() {

            @Override
            public int compare(int[] num1, int[] num2) {
                if (num1[0] == num2[0]) {
                    return num1[1] - num2[1];
                } else {
                    return num1[0] - num2[0];
                }
            }
            
        });


        // StringBuilder로 결과 작성
        StringBuilder sb = new StringBuilder();
        // String str;
        for (int j = 0; j < numArr.length; j++) {
            sb.append(numArr[j][0] + " " + numArr[j][1]).append("\n");

            // String res = numArr[j][0] + " " + numArr[j][1] + "\n";
            // str += res;
        }

        // 출력
        System.out.println(sb);
    }
}