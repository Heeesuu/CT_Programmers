package com.ll.level0.p120826;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }
}


class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replaceAll(letter, "");
        return answer;
    }
}