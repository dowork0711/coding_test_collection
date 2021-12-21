package AnswerJava.Main;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputValues = br.readLine().split(" ");

        int n = Integer.parseInt(inputValues[0]);
        int m = Integer.parseInt(inputValues[1]);
        int k = Integer.parseInt(inputValues[2]);

        int res = 0;
        while(n >= 2 && m >= 1 && m+n >= k+3) {
            n -= 2;
            m -= 1;
            res += 1;
        }
        br.close();
        System.out.println(res);
    }
}
