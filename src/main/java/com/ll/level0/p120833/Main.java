package com.ll.level0.p120833;

public class Main {
    public static void main(String[] args) {

    }
        }


class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = 0; i < num2 - num1 + 1; i++)
        answer[i] = numbers[num1 + i];

        return answer;
    }
}