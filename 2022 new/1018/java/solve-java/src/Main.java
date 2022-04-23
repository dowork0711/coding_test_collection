import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] charArr = new char[n][m];

        for (int i = 0; i < charArr.length; i++) {
            String str = br.readLine();
            Arrays.fill(charArr[i], str.charAt(i));
        }

        System.out.println(n);
        System.out.println(m);

        System.out.println(Arrays.deepToString(charArr));
    }
}