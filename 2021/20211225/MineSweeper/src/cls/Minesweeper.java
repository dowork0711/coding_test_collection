package cls;

import java.util.Random;

public class Minesweeper {

    int dx = 10;
    int dy = 10;
    int mine = 10;  // 지뢰의 개수

    // 지뢰가 들어갈 공간
    int[][] board = new int[dx][dy];

    // 배열에 0이나 1이 들어가고 1은 지뢰임
    // 모든 배열의 요소를 0으로 바꿔주기
    private void init() {
        for (int i = 0; i < dx; i++) {
            for (int j = 0; j < dy; j++) {
                board[i][j] = 0;
            }
        }
    }

    // 랜덤하게 지뢰 배치하기
    private void arrangeMineRandomly() {
        Random r = new Random();
        
    }


}
