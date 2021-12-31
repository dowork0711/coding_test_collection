package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstNum = sc.next();
        String secondNum = sc.next();

        List<Integer> fNum = new ArrayList<>();
        List<Integer> sNum = new ArrayList<>();

        for (int i = 0; i < firstNum.length(); i++) {
            fNum.add(Integer.parseInt(String.valueOf(firstNum.charAt(i))));
        }

        for (int i = 0; i < secondNum.length(); i++) {
            sNum.add(Integer.parseInt(String.valueOf(secondNum.charAt(i))));
        }

//        long firRes = 0;
//        for (Integer integer : fNum) {
//            firRes += integer;
//        }
//
//        long secRes = 0;
//        for (Integer integer : sNum) {
//            secRes += integer;
//        }

        long res = 0;
        for (int i = 0; i < fNum.size(); i++) {
            for (int j = 0; j < sNum.size(); j++) {
                res += (long) fNum.get(i) * sNum.get(j);
            }
        }

        System.out.println(res);
    }
}
