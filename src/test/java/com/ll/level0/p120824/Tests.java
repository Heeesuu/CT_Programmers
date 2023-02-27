package com.ll.level0.p120824;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("배열이 [1, 2, 3, 4, 5]일때 결과는 [2, 3] 짝수 2개 홀수 3개")
    void t1() {

        assertThat(new com.ll.level0.p120824.Solution().solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{2,3});

    }
}
