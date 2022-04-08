import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int gcd = getGcd(n, m);

        sc.close();

        System.out.println(gcd);            // 최대 공약수
        System.out.println(n * m / gcd);    // 최소 공배수
    }

    // 최대 공약수
    public static int getGcd(int n, int m) {
        
        if (m == 0) return n;
        
        return getGcd(m, n % m);
    }
}
