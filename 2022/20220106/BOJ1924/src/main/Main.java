package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();       // x
        int day = sc.nextInt();        // y

        sc.close();

        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };  // 월마다 며칠까지 있는지

        String[] datesInMonth = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

        int days = day;

        for (int i = 0; i < month - 1; i++) {
            days += daysInMonth[i];
        }

        System.out.println(datesInMonth[days % 7]);

    }
}
