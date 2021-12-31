package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] alphabet = new int[26];

        List<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            char firstChar = name.charAt(0);
            alphabet[firstChar-97] += 1;
        }

        boolean flag = false;
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] >= 5) {
                System.out.print((char)(i+97));
                flag = true;
            }
        }

        if(!flag) {
            System.out.print("PREDAJA");
        }

    }
}
