package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
        낮에 2m 올라가고 밤에 1m 미끄러짐 --> 하루동안 1m 올라감 --> 5m 올라가려면? 4일
        낮에 5m 올라가고 밤에 1m 미끄러짐 --> 하루동안 4m 올라감 --> 6m 올라가려면? 2일

        정상에 올라간 후에는 미끄러지지 않는다?!
    */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        br.close();

        int canGo = (v - b) / (a - b);

        if((v - b) % (a - b) != 0) {
            canGo++;
        }

        System.out.println(canGo);

    }
}
