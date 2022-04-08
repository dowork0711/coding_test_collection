import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }

        Arrays.sort(strArr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
            
        });

        System.out.println(strArr[0]);
        for (int i = 1; i < n; i++) {
            if (!strArr[i].equals(strArr[i-1])) {
                System.out.println(strArr[i]);
            }
        }

        sc.close();
    }
}