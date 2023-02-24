package com.ll.level0.p120817;


public class Main {
    public static void main(String[] args) {
        System.out.println(new com.ll.level0.p120817.Solution().solution(new int[]{1,2,3,4,5,6,7,8,9,10})); //-1
        System.out.println(new com.ll.level0.p120817.Solution().solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
}

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        answer = sum / numbers.length;


        return answer;
    }

}