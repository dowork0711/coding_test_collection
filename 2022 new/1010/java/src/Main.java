import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger n = new BigInteger(st.nextToken());
            BigInteger r = new BigInteger(st.nextToken());

            BigInteger res = new BigInteger("1");

            for (int j = 0; j < n.intValue(); j++) {
                res = res.multiply(r.subtract(BigInteger.valueOf(j)));
            }

            for (int j = 1; j <= n.intValue(); j++) {
                res = res.divide(BigInteger.valueOf(j));
            }

            System.out.println(res);
        }
        
    }
}