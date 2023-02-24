package com.ll.level0.p120803;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 3)); //-1
        System.out.println(new Solution().solution(11, 11));
        System.out.println(new Solution().solution(7, 99));
    }
}


class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;

    }
}