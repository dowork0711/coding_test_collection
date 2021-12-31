package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        String[] numArr = new String [cnt];

        String num = sc.next();

        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = String.valueOf(num.charAt(i));
            sum += Integer.parseInt(numArr[i]);
        }

        sc.close();

        System.out.println(sum);

    }
}
