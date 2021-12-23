// 백준 알고리즘 1076 : 저항

package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] colors = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };

        ArrayList<String> list = new ArrayList<>(Arrays.asList(colors));

        int firstColor = list.indexOf(sc.next())*10;
        int secondColor = list.indexOf(sc.next());
        int thirdColor = list.indexOf(sc.next());

        System.out.println((long)((firstColor + secondColor)*Math.pow(10, thirdColor)));

    }
}
