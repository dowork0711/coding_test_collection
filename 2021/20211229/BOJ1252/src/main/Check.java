package main;

import java.io.*;
import java.util.Scanner;

/*
    1. Scanner 대신 Buffer 사용
    2. fRep, SRep대신에 sum에 다 더한 결과를 집어넣으면 메모리 좀 더 효율적으로 사용 가능
    3. while(true) 부분에서 concat을 해서 String을 길게 만드는데 요 부분을 toBin에 저장하는게 아니라 즉시 출력하는 거로 바꾸면 해결될 것 같음
*/

public class Check {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String fNum = br.readLine();
        String sNum = br.readLine();

        long fRep = 0;
        long sRep = 0;
        int count = 1;
        long sum;

        if(fNum.equals("0") && sNum.equals("0")) {
            bw.write(0);
        } else {
            // 첫번째 입력받는 수를 10진수로 변환
            for (int i = fNum.length()-1; i >= 0; i--) {
                if(fNum.charAt(i) == '1') {
                    fRep += count;
                }
                count *= 2;
            }

            count = 1;

            // 두 번째 입력 받는 수를 10진수로 변환
            for (int i = sNum.length()-1; i >= 0; i--) {
                if(sNum.charAt(i) == '1') {
                    sRep += count;
                }
                count *= 2;
            }

            // 첫번째수와 두번째수의 합
            sum = fRep + sRep;

            // sum을 2진수로 변환
            String toBin = "";

            while(true) {
                toBin = String.valueOf(sum % 2).concat(toBin);
                if(sum == 1) break;
                else sum /= 2;
            }

            System.out.println(toBin);

        }

    }
}
