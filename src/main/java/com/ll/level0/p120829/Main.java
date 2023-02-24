package com.ll.level0.p120829;

public class Main {
    public static void main(String[] args) {
        System.out.println(new com.ll.level0.p120829.Solution().solution(180)); //-1
        System.out.println(new com.ll.level0.p120829.Solution().solution(10));
        System.out.println(new com.ll.level0.p120829.Solution().solution(90));
    }
}

class Solution{
    public int solution(int angle) {
        if(angle == 180) return 4;
        if(angle > 90 ) return 3;
        if(angle == 90) return 2;



        return 1;
    }
}
