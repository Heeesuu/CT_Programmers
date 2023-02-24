package com.ll.level0.p120830;

public class Main {
    public static void main(String[] args) {
        System.out.println(new com.ll.level0.p120830.Solution().solution(10, 3));
        System.out.println(new com.ll.level0.p120830.Solution().solution(64, 6));
    }
}

    class Solution {
        public int solution(int n, int k) {
            int answer = 0;
            answer = (n * 12000) + (k * 2000) - ((n/10)*2000);
            return answer;
        }
    }

