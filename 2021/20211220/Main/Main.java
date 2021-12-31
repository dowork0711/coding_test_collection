package Main;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputValue = br.readLine().split(" ");
        int a = Integer.parseInt(inputValue[0]);
        int b = Integer.parseInt(inputValue[1]);
        inputValue = br.readLine().split(" ");
        int c = Integer.parseInt(inputValue[0]);
        int d = Integer.parseInt(inputValue[1]);

        double[] resArr = {
            ((double)a / c) + ((double)b / d),
            ((double)c / d) + ((double)a / b),
            ((double)d / b) + ((double)c / a),
            ((double)b / a) + ((double)d / c),
        };

        double maxValue = 0;
        int index = 0;

        for (int i = 0; i < resArr.length; i++) {
            if(maxValue < resArr[i]) {
                maxValue = resArr[i];
                index = i;
            }
        }
        bw.write(index + "\n");
        bw.close();
    }
}
