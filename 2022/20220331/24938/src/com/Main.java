package com;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int roomCount = sc.nextInt();

        int[] roomNum = new int[roomCount];

        for (int i = 0; i < roomNum.length; i++) {
            int room = sc.nextInt();
            roomNum[i] = room;
        }

        Arrays.sort(roomNum);

        int answer = 0;
        for (int j : roomNum) {
            if (j == roomCount) {
                answer = j / roomCount;
            } else {
                answer += j;
                answer = answer / roomCount;
                answer = answer + roomNum[roomNum.length-1];
            }
        }

//        answer = answer / roomCount;
//        answer = answer + roomNum[roomNum.length-1];


//        System.out.println(Arrays.toString(roomNum));
        System.out.println(answer);


    }
}
