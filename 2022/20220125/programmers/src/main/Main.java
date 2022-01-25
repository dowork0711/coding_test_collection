package main;

// 구현
class Solution {
    public long solution(long w, long h) {
        long answer = 0;

        for(int i = 0; i < w; i++) {
            answer += (h * i) / w;
        }

        return answer * 2;
    }
}

// 테스트
public class Main {

    public static void main(String[] args) {
	    Solution s = new Solution();
        long res = s.solution(8, 12);
        System.out.println(res);
    }
}