package com.ll.level0.p120906;


public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
         answer = (n + "") //123 => "123" 문자열로 만듬
                 .chars() //"123" => intStream[49,50, 51] 문자열을 숫자 배열로 변환
                .map(e -> Character.getNumericValue(e)) //intStream[49,50, 51] => intStream[1,2,3] 넘버릭벨류로 다시 숫자로 변환
                .sum(); //intStream[1,2,3] => 6 각각의 값들을 더해줌

        return answer;

    }
}