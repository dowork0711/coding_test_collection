package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dot = 2;

        for (int i = 0; i < n; i++) {
            dot += Math.pow(2, i);
        }

        System.out.println((int)Math.pow(dot, 2));

    }
}
