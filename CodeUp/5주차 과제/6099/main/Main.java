import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] routesArr = new int [10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                routesArr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // 출발점
        int start = 1;  // 세로
        int end = 0;    // 종료


        for (int i = 1; i < routesArr.length-1; i++) {
            if (end != 1){
                for (int j = start; j < routesArr.length; j++) {
                    if (routesArr[i][j] == 0) {  // 정상적으로 지나가는 것
                        routesArr[i][j] = 9;
                    } else if (routesArr[i][j] == 2) {  // 먹이가 있는 경우
                        routesArr[i][j] = 9;
                        end = 1;
                        break;
                    } else {
                        start = j - 1;
                        break;
                    }
                }
            } else {
                break;
            }
        }

        // 결과 출력하기
        for (int i = 0; i < routesArr.length; i++) {
            for (int j = 0; j < routesArr.length; j++) {
                System.out.print(routesArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}