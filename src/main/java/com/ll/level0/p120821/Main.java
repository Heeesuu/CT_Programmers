package com.ll.level0.p120821;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println(new com.ll.level0.p120821.Solution().solution(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println(new com.ll.level0.p120821.Solution().solution(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println(new com.ll.level0.p120821.Solution().solution(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}


class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length-i-1];

        }

        return answer;
    }
}


