import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int E = 1;
        int S = 1;
        int M = 1;

        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        for(int y = 1;;y++) {
            if (e == E && s == S && m == M) {
                System.out.println(y);
                break;
            }

            E += 1;
            S += 1;
            M += 1;

            if (E == 16) E = 1;
            if (S == 29) S = 1;
            if (M == 20) M = 1;
        }
    }
}