import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }

    }

}
