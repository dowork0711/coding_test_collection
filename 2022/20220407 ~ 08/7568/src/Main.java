import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] person = new int [n][2];
        
        for (int i = 0; i < n; i++) {
            person[i][0] = sc.nextInt();
            person[i][1] = sc.nextInt();
        }   // 배열 채우기

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int rank = 1;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;   // 같은 경우 패스
                if (person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
                    rank += 1;
                }   // 각 크기를 비교해서 참이면 rank에 1 더함.
            }

            sb.append(rank).append(' ');
        }

        sc.close();

        System.out.println(sb);
    }
}