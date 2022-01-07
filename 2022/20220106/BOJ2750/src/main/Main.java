package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int[] numArr = new int [cnt];

        // 입력받아 배열에 넣어주기
        for (int i = 0; i < numArr.length; i++) {
            int nums = sc.nextInt();
            numArr[i] = nums;
        }

        // 정렬
        Arrays.sort(numArr);

        /*
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 1; j < numArr.length; j++) {
                int temp;
                if (numArr[i] < numArr[j]) {
                    temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }
        */

        for (int num : numArr) {
            System.out.println(num);
        }

    }
}
