package com.ll.level0.p120841;

public class Main {
    public static void main(String[] args) {

        System.out.println(new com.ll.level0.p120841.Solution().solution(new int[]{2, 4}));
        System.out.println(new com.ll.level0.p120841.Solution().solution(new int[]{-7, 9}));

    }
}


class Solution {
    public int solution(int[] dot) {
        int answer = 0;

        if (dot[0] > 0 && dot[1] > 0) {

            answer = 1;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else {
            return 4;
        }

        return answer;
    }
}