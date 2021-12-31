package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();


        for (int i = 0; i < tc; i++) {
            String ref = sc.next();
            int sum = 0, cnt = 0;
            for (int j = 0; j < ref.length(); j++) {
                if (ref.charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                } else cnt = 0;
            }
            System.out.println(sum);
        }
    }
}
