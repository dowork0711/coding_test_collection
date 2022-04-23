import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 점의 개수
        int len = Integer.parseInt(br.readLine());

        // 좌표를 넣어줄 배열
        int[][] numArr = new int [len][2];

        StringTokenizer st;
        for (int i = 0; i < numArr.length; i++) {
            st = new StringTokenizer(br.readLine());
            numArr[i][0] = Integer.parseInt(st.nextToken());
            numArr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numArr, (num1, num2) -> {
            if (num1[0] == num2[0]) {
                return num1[1] - num2[1];
            } else {
                return num1[0] - num2[0];
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < numArr.length; j++) {
            sb.append(numArr[j][0] + " " + numArr[j][1]).append("\n");
        }

        System.out.println(sb);
    }
}