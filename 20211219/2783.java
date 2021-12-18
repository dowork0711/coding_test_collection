import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();       // x원
        int y = sc.nextInt();       // y그램
        int n = sc.nextInt();       // n개 점포

        double minPrice = (double)x / y * 1000; 

        for (int i = 0; i < n; i++) {
            int xi = sc.nextInt();
            int yi = sc.nextInt();

            double pr = (double) xi / yi * 1000;

            minPrice = Math.min(minPrice, pr);
        }

        System.out.println(minPrice);

        sc.close();



    }
}