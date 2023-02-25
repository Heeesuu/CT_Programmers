package com.ll.level0.p120816;

public class Main {
    public static void main(String[] args) {
        System.out.println(new com.ll.level0.p120816.Solution().solution(7,10)); //2
        System.out.println(new com.ll.level0.p120816.Solution().solution(4,12));//3

    }
}

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int i = 0;
        while (slice * i < n) {
            i ++;
            answer = i;
        }
        return answer;
    }
}