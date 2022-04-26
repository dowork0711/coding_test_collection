import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        int [] numCard = new int [10];

        for (char c : n.toCharArray()) {
            int num = c - '0';
            if (num == 9) {
                num = 6;
            }
            numCard[num]++;

        }

        numCard[6] = numCard[6] / 2 + numCard[6] % 2;
        Arrays.sort(numCard);

        System.out.println(numCard[9]);
    }
}