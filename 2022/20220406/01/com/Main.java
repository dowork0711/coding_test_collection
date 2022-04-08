/*
    1. 정렬
    2. 상품과 박스를 하나씩 빼서 비교 : 상품이 박스보다 작거나 같으면 count 증가, 넘어가
                                반대의 경우 박스를 아예 삭제
    
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] goods = { 1, 1, 1 };
        int[] boxes = { 1 };

        System.out.println(solution(goods, boxes));
        
    }

    // solution 함수
    public static int solution(int[] goods, int[] boxes) {

        int gi = 0;
        int bi = 0;
        int count = 0;
        
        Arrays.sort(goods);
        Arrays.sort(boxes);

        while(true) {
            
            if (gi >= goods.length || bi >= boxes.length) {
                return count;
            }   // 배열의 길이로 비교

            if (goods[gi] <= boxes[bi]) {
                gi += 1;
                bi += 1;
                count += 1;
            } else {
                bi += 1;
            }   // 배열 내부의 값으로 비교
        }

    }
}
