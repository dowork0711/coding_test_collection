package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            String x = st.nextToken();

            if (x.equals("0")) break;

            list.add(x);
        }

        // System.out.println(list);

        for (String str : list) {
            String yes = "yes";
            int len = str.length() / 2;

            for (int i = 0; i < len; i++) {
                if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                    yes = "no";
                    break;
                }
            }

            System.out.println(yes);
        }

    }
}
