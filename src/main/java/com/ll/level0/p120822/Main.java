package com.ll.level0.p120822;

public class Main {
    public static void main(String[] args) {

    }
}


class Solution {
    public String solution(String my_string) {

        StringBuffer sb = new StringBuffer(my_string);
        String answer = sb.reverse().toString();
        return answer;
    }
}