// 결과는 나오는데... 망한듯

package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fNum = sc.next();
        String sNum = sc.next();

        long fRep = 0;
        long sRep = 0;
        int count = 1;
        long sum;

        if(fNum.equals("0") && sNum.equals("0")) {
            System.out.println(0);
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
