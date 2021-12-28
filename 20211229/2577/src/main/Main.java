package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fNum = sc.nextInt();
        int sNum = sc.nextInt();
        int tNum = sc.nextInt();

        String cal = Integer.toString(fNum * sNum * tNum);

        sc.close();

        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < cal.length(); j++) {
                if((cal.charAt(j) - '0') == i) {
                    cnt++;
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }

    }
}
