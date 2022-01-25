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

