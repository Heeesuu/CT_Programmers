package com.ll.level0.p120824;

public class Main {
    public static void main(String[] args) {

    }
}


class Solution {
    public int[] solution(int[] num_list) {
        int a = 0;
        int b = 0;
        int[] answer = new int[2];
        for (int i = 0; i<num_list.length; i++){
            if (num_list[i] % 2 == 0){
                a ++;

            } else {
                b++;
            }
        }
        answer[0] = a;
        answer[1] = b;
        return answer;
    }
}