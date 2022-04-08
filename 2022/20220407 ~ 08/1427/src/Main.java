import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        char[] charArr = n.toCharArray();
        Arrays.sort(charArr);

        for (int i = charArr.length - 1; i >= 0; i--) {
            System.out.print(charArr[i]);
        }

        sc.close();

    }
}