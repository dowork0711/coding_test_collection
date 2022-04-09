package test.sortArray;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        
        // Integer[] numArr = { 2, 6, 4, 1, 5, 3 };

        // 오름차순으로 정렬
        // Arrays.sort(numArr);

        // 내림차순으로 정렬
        // Arrays.sort(numArr, Collections.reverseOrder());

        // System.out.println(Arrays.toString(numArr));

        String[] strArr = {"가면", "나들이", "가구", "노래듣기", "라디오", "다람쥐"};
        // Arrays.sort(strArr);
        // Arrays.sort(strArr, Collections.reverseOrder());


        System.out.println(Arrays.toString(solutions(strArr, 0)));
    }

    public static String[] solutions(String[] strArr, int n) {
        Arrays.sort(strArr, new Comparator<String>() {
            // @Override
            // public int compare(String o1, String o2) {
            //     return o1.length() - o2.length();
            // }

            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) {
                    return 1;
                } else if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                } else {
                    return -1;
                }
            }
        });

        return strArr;
    }
}
