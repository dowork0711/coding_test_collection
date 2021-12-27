package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int[] s1Arr = new int [s1];
        int[] s2Arr = new int [s2];
        int[] s3Arr = new int [s3];

        for (int i = 0; i < s1; i++) {
            s1Arr[i] = i+1;
        }

        for (int i = 0; i < s2; i++) {
            s2Arr[i] = i+1;
        }

        for (int i = 0; i < s3; i++) {
            s3Arr[i] = i+1;
        }

        int sum = 0;
        int arrLength = s1 * s2 * s3;
        int[] total = new int [arrLength];

        for (int i = 0; i < s1Arr.length; i++) {
            for (int j = 0; j < s2Arr.length; j++) {
                for (int k = 0; k < s3Arr.length; k++) {
                    total[i] = s1Arr[i] + s2Arr[j] + s3Arr[j];
                    total[i+j+k]++;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < total.length; i++) {
            count = Math.max(count, total[i]);
        }

        System.out.println(Arrays.toString(total));
        System.out.println(count);

    }
}
