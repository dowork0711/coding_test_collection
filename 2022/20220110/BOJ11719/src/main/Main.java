package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        ArrayList<String> li = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            str = br.readLine();
            if (str == null) li.add("");
            else             li.add(str);
        }

        for (String s : li) System.out.println(s);

    }
}
