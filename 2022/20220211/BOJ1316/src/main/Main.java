import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 그룹단어 체커

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int checkNum = n;

        for(int i = 0; i < n; i++) {
            String word = sc.next();

            // 알파벳 사용 체크를 위한 배열
            boolean[] checker = new boolean [26];

            for (int j = 1; j < word.length(); j++) {

                if (word.charAt(i-1) != word.charAt(i)) {
                    if (checker[word.charAt(i)-97] == true) {
                        checkNum--;
                        break;
                    }
                }
                checker[word.charAt(i-1)-97] = true;
            }
        }

        sc.close();

        System.out.println(checkNum);

    }
}