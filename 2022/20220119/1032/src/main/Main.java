package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        String[] stringArray = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            stringArray[i] = sc.next();
        }

        boolean rep;

        for (int i = 0; i < stringArray[0].length(); i++) {
            rep = false;
            for (int j = 0; j < cnt-1; j++) {
                if(stringArray[j].charAt(i) != stringArray[j+1].charAt(i)) {
                    rep = true;
                    break;
                }
            }
            if (rep) {
                System.out.print("?");
            } else  {
                System.out.print(stringArray[0].charAt(i));
            }
        }
    }
}
