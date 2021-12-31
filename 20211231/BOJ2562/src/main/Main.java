package main;


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int p = Integer.parseInt(br.readLine());

            if (p > max) {
                max = p;
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);

    }
}
