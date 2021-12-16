import java.util.*;

public class TwoThousandSevenHundredTwentyOne {
    public static void main(String[] args) {
    
      // 테스트 케이스 입력
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();

      for (int i = 0; i < T; i++) {
        int number = sc.nextInt();
        int sum = 0;

        for (int j = 0; j <= number; j++) {
          sum += j * (j + 1) * (j + 2) /2 ;
        }

        System.out.println(sum);
      }

    }
}