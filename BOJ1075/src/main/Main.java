package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = sc.nextInt();

        int temp = (n/100) * 100;

        while(true) {
            if(temp % f == 0) {
                int res = temp % 100;
                if(res < 10) System.out.println("0" + res);
                else System.out.println(res);
                break;
            }
            temp++;
        }
    }
}
