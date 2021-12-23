package main;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = br.readLine();

        String[] inputArr = inputStr.split(" ");

        int index = 0;

        for (int i = 0; i < inputArr.length; i++) {
            index = inputArr.length;
            if(inputArr[0].equals("")) {
                index-=1;
            }
        }
        System.out.println(index);

    }
}
